# Wrapper Classes

## Question

What are wrapper classes in Java, and why do we use them?

## Answer

Wrapper classes are object versions of primitive types.

Examples:

- `int` -> `Integer`
- `double` -> `Double`
- `boolean` -> `Boolean`
- `char` -> `Character`

We use wrappers when we need objects instead of raw primitives, especially in collections, generic APIs, parsing, and nullable fields.

## Code-backed explanation

See [`WrapperClassesDemo.java`](./WrapperClassesDemo.java).

The demo shows:

- wrapper assignment like `Integer age = 25`
- parsing with `Integer.valueOf("42")`
- nullable wrapper values such as `Integer nullableScore = null`

## Run it

```bash
javac variables-types/*.java
java -cp variables-types WrapperClassesDemo
```

## Interview-ready summary

Wrappers let primitives behave like objects.

That is why they are required in generic collections like `List<Integer>`.
