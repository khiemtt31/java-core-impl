# TreeSet

## Question

What is TreeSet?

## Answer

`TreeSet` is a `Set` implementation that keeps unique values in sorted order.

It uses natural ordering for comparable elements unless you provide a comparator.

## Code-backed explanation

See [`TreeSetDemo.java`](./TreeSetDemo.java).

The demo shows:

- values are sorted automatically
- duplicates are ignored
- `first()` and `last()` reflect the sorted order

## Run it

```bash
javac set/*.java
java -cp set TreeSetDemo
```

## Interview-ready summary

Use `TreeSet` when sorted unique values are more important than raw insertion speed.
