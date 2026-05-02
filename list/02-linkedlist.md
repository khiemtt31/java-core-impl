# LinkedList

## Question

What is LinkedList, and when is it better than ArrayList? -> LinkedList is a list implementation that uses a doubly linked list to store its elements. It is better than ArrayList when you frequently add or remove items near the ends of the list, or when you already have a position in the list (address of the element). For plain get(index) access, ArrayList is usually faster.

## Answer

`LinkedList` stores each element in a node linked to the next and previous node.
It is useful when you frequently add or remove items near the ends, or when you already have a position in the list.
For plain `get(index)` access, `ArrayList` is usually faster.

## Code-backed explanation

See [`LinkedListDemo.java`](./LinkedListDemo.java).

The demo shows:

- `addFirst(...)` and `addLast(...)`
- inserting in the middle of the list
- removing from both ends

## Run it

```bash
javac list/*.java
java -cp list LinkedListDemo
```

## Interview-ready summary

`ArrayList` is usually faster for random access.

`LinkedList` is better only when the workload is dominated by inserts and removals near the ends or by iterator-based edits.

For the self-test prompt, the faster choice for "insert" depends on the location.
`ArrayList` is usually fastest for append, while `LinkedList` can help with end-heavy edits.
