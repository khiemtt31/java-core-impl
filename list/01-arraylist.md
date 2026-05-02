# ArrayList

## Question

What is ArrayList? -> ArrayList is a resizable array-backed List implementation in Java. It provides fast indexed access and efficient appending at the end, but inserting or removing elements near the front or middle requires shifting elements, which can be less efficient.

## Answer

`ArrayList` is a resizable array-backed `List`.
It gives fast indexed reads and fast append-at-end behavior, but inserting or removing near the front or middle requires shifting elements.

## Code-backed explanation

See [`ArrayListDemo.java`](./ArrayListDemo.java).

The demo shows:

- `get(index)` reads directly by position
- `add(index, value)` inserts and shifts later elements
- `remove(index)` also shifts elements left

## Run it

```bash
javac list/*.java
java -cp list ArrayListDemo
```

## Interview-ready summary

Use `ArrayList` when you read by index often and mostly add at the end.
