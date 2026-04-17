# Critical Core

This folder contains runnable Java examples and interview-style notes for the next section of the roadmap in the root `README.md`.

## What is included

- `CriticalCoreApp.java` runs every demo in one pass.
- Each topic also has its own runnable class so you can execute one concept at a time.
- Each interview question has a matching `.md` file with an explanation and code-backed answer.

## How to run

From the repository root:

```bash
javac critical-core/*.java
java -cp critical-core CriticalCoreApp
```

To run a single topic:

```bash
java -cp critical-core StaticDemo
```

## Learning order

1. `static`
2. `final`
3. `this` and `super`
