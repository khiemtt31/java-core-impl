# Context For This Module

This file documents how the `variables-types` folder was built so it can be reused later as a prompt base.

## Source of truth

The root [`README.md`](../README.md) contains the checklist and interview prompts for part I request

## What I created

I turned that section into a small learning module with three layers:

1. Runnable Java demos
2. Prompt-answer markdown files
3. A folder-level index and run instructions

## File structure

- [`README.md`](./README.md) explains how to compile and run the module.
- `01-...md` through `06-...md` provide question-and-answer explanations tied back to the runnable code.
- [`00-index.md`](./00-index.md) acts as a quick directory map.

## Design rules I followed

- Keep every topic independently runnable with `main`.
- Keep the master flow runnable with one command.
- Put explanatory comments above each class and method so the code itself teaches the concept.
- Favor small, focused demos over one large file so each interview question has a direct code example.
- Use markdown files for interview-style answers so later prompts can reference a precise file instead of re-explaining the entire section.

## How to compile and run

From the repository root:

```bash
javac variables-types/*.java
java -cp variables-types VariablesTypesApp
```

To run a single topic:

```bash
java -cp variables-types PassByValueDemo
```

## How the answers map to the code

- If the question is about assignment behavior, use `PrimitiveVsReferenceDemo.java`.
- If the question is about where data lives, use `StackVsHeapDemo.java`.
- If the question is about method arguments, use `PassByValueDemo.java`.
- If the question is about wrapper conversion, use `AutoboxingUnboxingDemo.java`.
- If the question is about wrapper usage, use `WrapperClassesDemo.java`.
- If the question is about wrapper identity, use `IntegerCachingDemo.java`.
==> Each markdown file (e.g., `01-PrimitiveVsReference.md`) contains the interview question, a concise answer, and references to the relevant code demo for deeper understanding.

## Prompt base idea

If you want to generate future prompts from this module, use `context.md` as the source and ask for one of these actions:

- explain the concept in interview language
- derive a new runnable example from the existing code
- create a comparison table
- add another concept to the checklist in the same style

## Assumption used

I treated the request as a learning repository, not just a written answer.
That is why the output includes executable Java and question-specific documentation instead of only prose.
