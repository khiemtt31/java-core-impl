# LinkedHashSet

## Question

What is LinkedHashSet?

## Answer

`LinkedHashSet` is a `Set` implementation that keeps unique values and preserves insertion order during iteration.

It is useful when you want Set behavior without losing the order in which items were added.

## Code-backed explanation

See [`LinkedHashSetDemo.java`](./LinkedHashSetDemo.java).

The demo shows:

- items stay in the order they were first inserted
- duplicates are ignored
- the printed order matches the insertion sequence

## Run it

```bash
javac set/*.java
java -cp set LinkedHashSetDemo
```

## Interview-ready summary

Use `LinkedHashSet` when uniqueness matters and you also want stable iteration order.
