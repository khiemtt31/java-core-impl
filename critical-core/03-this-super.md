# This And Super

## Question

When do you use `this` and `super` in Java?

## Answer

Use `this` to refer to the current object or to chain constructors in the same class.

Use `super` to access the parent class constructor or parent class methods and fields.

## Code-backed explanation

See [`ThisSuperDemo.java`](./ThisSuperDemo.java).

The key behavior is:

- `Child(String name)` uses `this(name, 1)` to chain constructors.
- `Child(String name, int level)` uses `super(name)` to call the parent constructor.
- `greet()` overrides the parent method and calls `super.greet()` inside it.
- This is a standard constructor-chaining example, not a case where `this()` and `super()` are both called in the same constructor body.

## Run it

```bash
javac critical-core/*.java
java -cp critical-core ThisSuperDemo
```

## Interview-ready summary

`this` refers to the current object or current class constructor chain.

`super` refers to the parent class.
