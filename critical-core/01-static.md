# Static

## Question

What does `static` mean in Java?

## Answer

`static` means the member belongs to the class, not to a single object.

That means one shared copy exists for the whole class, so every instance sees the same static state.

## Code-backed explanation

See [`StaticDemo.java`](./StaticDemo.java).

The key behavior is:

- `createdCount` is shared by all objects.
- The `static` block runs once when the class is loaded.
- `getCreatedCount()` works without an object.
- `Helper` is a static nested class, so it does not need an outer instance.

## Run it

```bash
javac critical-core/*.java
java -cp critical-core StaticDemo
```

## Interview-ready summary

`static` = class-level, shared, and accessible without creating an object.
