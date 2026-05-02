# Equals and HashCode

## Question

Why do `equals()` and `hashCode()` need to be overridden together?

## Answer

`equals()` decides whether two objects are logically equal.

`hashCode()` must return the same value for equal objects, because hash-based collections look at the hash code first and then use `equals()` to confirm a match.

If you override only one of them, `HashSet` and `HashMap` can store duplicates or fail lookups even when two objects have the same data.

## Code-backed explanation

See [`EqualsHashCodeDemo.java`](./EqualsHashCodeDemo.java).

The demo shows:

- default `Object` behavior treats two same-state objects as different
- a proper value-based `Order` class compares equal and shares a hash code
- `HashSet.contains(...)` works only after both methods are aligned

## Run it

```bash
javac object-class/*.java
java -cp object-class EqualsHashCodeDemo
```

## Interview-ready summary

Equal objects must have equal hash codes.

If not, hash-based collections can miss matches or keep duplicates.
