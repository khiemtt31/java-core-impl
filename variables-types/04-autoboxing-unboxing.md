# Autoboxing and Unboxing

## Question

What are autoboxing and unboxing in Java?

## Answer

Autoboxing is the automatic conversion from a primitive to its wrapper class.
Unboxing is the automatic conversion from a wrapper class back to a primitive.

This is convenient in collections and APIs, but it can also hide performance costs and null-related runtime errors.

## Code-backed explanation

See [`AutoboxingUnboxingDemo.java`](./AutoboxingUnboxingDemo.java).

The demo shows:

- `scores.add(10)` autoboxes `10` into `Integer`
- `int firstScore = scores.get(0)` unboxes `Integer` into `int`
- unboxing `null` throws `NullPointerException`

## Run it

```bash
javac variables-types/*.java
java -cp variables-types AutoboxingUnboxingDemo
```

## Interview-ready summary

Autoboxing = primitive to wrapper.

Unboxing = wrapper to primitive.

Null wrappers are dangerous because unboxing them fails at runtime.
