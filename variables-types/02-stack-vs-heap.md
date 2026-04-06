# Stack vs Heap Memory

## Question

What is the difference between stack and heap memory in Java?

## Answer

The stack is used for method calls, local variables, and references.
The heap is used for objects and arrays.

In practice, you do not inspect raw stack or heap addresses in normal Java code. You infer the behavior by watching what gets copied, what gets shared, and what survives across method calls.

## Code-backed explanation

See [`StackVsHeapDemo.java`](./StackVsHeapDemo.java).

The demo shows:

- `int chapterCount = 3;` is a local primitive value.
- `Book book = new Book(...);` stores a reference locally while the `Book` object lives on the heap.
- `Book anotherReference = book;` creates a second reference to the same object.
- Mutating `anotherReference` changes the same heap object seen by `book`.

## Run it

```bash
javac variables-types/*.java
java -cp variables-types StackVsHeapDemo
```

## Interview-ready summary

Stack = method frame and local variables.

Heap = objects and arrays.

Local references are on the stack, but the referenced object is on the heap.
