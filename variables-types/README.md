# Variables & Types

This folder contains runnable Java examples and prompt-style answers for the first section of the roadmap in the root `README.md`.

## What is included

- `VariablesTypesApp.java` runs every demo in one pass.
- Each concept also has its own runnable class so you can execute one topic at a time.
- Each interview question has a matching `.md` file with an explanation and code-backed answer.

## How to run

From the repository root:

```bash
javac variables-types/*.java
java -cp variables-types VariablesTypesApp
```

To run a single topic:

```bash
java -cp variables-types PassByValueDemo
```

## Learning order

1. Primitive vs reference types
2. Stack vs heap memory
3. Java pass-by-value
4. Autoboxing and unboxing
5. Wrapper classes
6. Integer caching
