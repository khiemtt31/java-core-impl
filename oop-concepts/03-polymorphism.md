# Polymorphism

**Question**

Method overloading vs overriding? -> overloading is same method with different parameters, overriding is subclass replacing parent method.

**Answer**

**Overloading** means the same method name with different parameters.
It is resolved at compile time.

**Overriding** means a subclass replaces a parent method with the same signature.
It is resolved at runtime.

In `PolymorphismDemo.java`, `Calculator.add()` is overloaded, while `Shape.area()` is overridden by `Circle` and `Rectangle`.

**Why it matters**

- overloading improves API convenience
- overriding enables runtime behavior changes

**Reference**

- [`PolymorphismDemo.java`](./PolymorphismDemo.java)
