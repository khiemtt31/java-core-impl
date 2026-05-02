# Object Class

This folder contains runnable Java examples and interview-style notes for section 4 in the root `README.md`.

## What is included

- `ObjectClassApp.java` runs every demo in one pass.
- Each topic also has its own runnable class so you can execute one concept at a time.
- Each interview question has a matching `.md` file with an explanation and code-backed answer.

## How to run

From the repository root:

```bash
javac object-class/*.java
java -cp object-class ObjectClassApp
```

To run a single topic:

```bash
java -cp object-class EqualsHashCodeDemo
```

## Learning order

1. `equals()` and `hashCode()`
2. `toString()`
3. `clone()`
