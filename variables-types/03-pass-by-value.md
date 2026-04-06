# Pass By Value

## Question

Why is Java always pass-by-value?

## Answer

Java always copies the value of the argument into the method parameter.

For primitives, the copied value is the primitive itself.
For objects, the copied value is the reference value.

That is why:

- changing a primitive parameter does not change the caller's variable
- mutating an object parameter changes the shared object
- reassigning the parameter does not change the caller's reference

## Code-backed explanation

See [`PassByValueDemo.java`](./PassByValueDemo.java).

The demo shows three cases:

- `incrementPrimitive(int value)` only changes the local copy.
- `incrementCounter(Counter counter)` mutates the shared object.
- `replaceCounter(Counter counter)` reassigns only the local parameter.

## Run it

```bash
javac variables-types/*.java
java -cp variables-types PassByValueDemo
```

## Interview-ready summary

Java does not pass objects by reference.

It passes the reference value by value.

That is the whole trick.
