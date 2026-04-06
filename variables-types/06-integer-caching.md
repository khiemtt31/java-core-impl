# Integer Caching

## Question

Why does Integer caching exist?

## Answer

`Integer` caching exists as a JVM optimization for commonly used values.

By default, Java caches `Integer` objects in the range `-128` to `127`.
So repeated boxing of values in that range can reuse the same object.

This is why `==` sometimes returns `true` for `Integer` values in the cache range and `false` outside it.

## Code-backed explanation

See [`IntegerCachingDemo.java`](./IntegerCachingDemo.java).

The demo shows:

- `Integer cachedA = 127; Integer cachedB = 127;` often compares `true` with `==`
- `Integer uncachedA = 128; Integer uncachedB = 128;` typically compares `false` with `==`
- `equals()` still compares the numeric value correctly

## Run it

```bash
javac variables-types/*.java
java -cp variables-types IntegerCachingDemo
```

## Interview-ready summary

Cache is an optimization, not a rule you should rely on for logic.

Use `equals()` for wrapper value comparison.
