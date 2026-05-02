# Clone

## Question

What does `clone()` do in Java? -> clone() creates a field-by-field copy of an object. The copy is shallow by default, so nested mutable objects are shared unless you deep copy them yourself. 

## Answer

`clone()` creates a field-by-field copy of an object.

The copy is shallow by default, so nested mutable objects are shared unless you deep copy them yourself. A class also has to implement `Cloneable`, or `super.clone()` will fail.

## Code-backed explanation

See [`CloneDemo.java`](./CloneDemo.java).

The demo shows:

- `clone()` returns a different object instance
- nested mutable state can still be shared
- changing the clone can affect the original when the copy is shallow

## Run it

```bash
javac object-class/*.java
java -cp object-class CloneDemo
```

## Interview-ready summary

`clone()` is usually a shallow copy, so it must be used carefully.

In real code, copy constructors or factory methods are often clearer.
