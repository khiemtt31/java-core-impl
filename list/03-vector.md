# Vector

## Question

What is Vector? -> Vector is a legacy resizable array list in Java. It is synchronized, meaning that it is thread-safe at the method level, but this synchronization can lead to performance overhead compared to ArrayList. In modern Java programming, ArrayList is generally preferred over Vector unless you specifically need the thread safety provided by Vector or are working with legacy code that requires it.

## Answer

`Vector` is a legacy resizable array list.
It is synchronized, so it is thread-safe at the method level, but that extra locking makes it less attractive than `ArrayList` in modern code.

## Code-backed explanation

See [`VectorDemo.java`](./VectorDemo.java).

The demo shows:

- `Vector` still grows like a resizable list
- `capacity()` changes as elements are added
- it is mainly useful as basic interview knowledge

## Run it

```bash
javac list/*.java
java -cp list VectorDemo
```

## Interview-ready summary

Know `Vector` as the old synchronized cousin of `ArrayList`.

Prefer `ArrayList` unless you specifically need legacy compatibility or external synchronization is already part of the design.
