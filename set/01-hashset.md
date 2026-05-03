# HashSet

## Question

What is HashSet?
What is the difference between HashSet and Set ?

## Answer

`HashSet` is a `Set` implementation that stores unique values and gives fast average-time add, remove, and contains operations.

It does not guarantee iteration order.

## Code-backed explanation

See [`HashSetDemo.java`](./HashSetDemo.java).

The demo shows:

- adding a value returns `true` the first time and `false` for a duplicate
- duplicate values do not increase the size
- the printed contents contain each value only once

## Run it

```bash
javac set/*.java
java -cp set HashSetDemo
```

## Interview-ready summary

Use `HashSet` when you only need unique values and do not care about order.

It is the default Set choice for fast lookup and duplicate removal.
