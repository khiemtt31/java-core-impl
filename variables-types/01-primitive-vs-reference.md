# Primitive vs Reference Types

## Question

What is the difference between primitive types and reference types in Java?

## Answer

Primitive types store the actual value directly.
Reference types store a reference value that points to an object.

That difference matters because copying a primitive gives you a separate value, while copying a reference gives you another variable pointing to the same object.

## Code-backed explanation

See [`PrimitiveVsReferenceDemo.java`](./PrimitiveVsReferenceDemo.java).

The key behavior is:

- `int primitiveB = primitiveA;` copies the number.
- `Person bob = alice;` copies the reference value, not the object itself.
- Updating `bob.setName("Bob")` changes the shared object, so `alice` sees the same change.

## Run it

```bash
javac variables-types/*.java
java -cp variables-types PrimitiveVsReferenceDemo
```

## Interview-ready summary

Primitive = the value itself.

Reference = a value that points to an object.

When you assign a reference, Java copies the reference value, not the object.
