# Final

## Question

What does `final` mean in Java?

## Answer

`final` means something cannot be changed after assignment.

You can apply it to variables, methods, and classes.

## Code-backed explanation

See [`FinalDemo.java`](./FinalDemo.java).

The key behavior is:

- `COURSE_NAME` is a final constant.
- `learnerName` is a final instance field set in the constructor.
- `describe()` is final, so subclasses cannot override it.
- `FinalToken` is a final class, so it cannot be extended.
- A final reference can still point to a mutable object like `StringBuilder`.

## Run it

```bash
javac critical-core/*.java
java -cp critical-core FinalDemo
```

## Interview-ready summary

`final` protects reassignment or overriding. It does not automatically make an object immutable.
