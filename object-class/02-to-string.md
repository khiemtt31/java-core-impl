# ToString

## Question

Why override `toString()`? -> To make logging and debugging easily and also readable logging's.

## Answer

`Object.toString()` usually prints an identity-style string like `ClassName@hash`, which is not helpful in logs or debugging.

Override it to return meaningful object state, and remember that `System.out.println(object)` calls `toString()` automatically.

## Code-backed explanation

See [`ToStringDemo.java`](./ToStringDemo.java).

The demo shows:

- the default `Object.toString()` output
- a readable custom `toString()` implementation
- why logging gets easier when the object prints its own state

## Run it

```bash
javac object-class/*.java
java -cp object-class ToStringDemo
```

## Interview-ready summary

`toString()` should tell a human what the object contains, not where it lives in memory.
