# Abstraction

**Question**

Abstract class vs interface? -> Abstract class can have state and partial implementation while an interface is a pure contract without any state or implementation.

When to use interface?  -> When you want to define a contract that multiple unrelated classes can implement, or when you want to achieve loose coupling without shared state.

**Answer**

Use an **abstract class** when you need shared state or partial implementation.
Use an **interface** when you need a contract or capability that many unrelated classes can implement.

Use an interface when:

- multiple classes need the same capability
- you want loose coupling
- you do not need shared fields or constructor state

In `AbstractionDemo.java`, `Report` is an abstract class because it shares title and print flow.
`Exportable` is an interface because it describes a capability.

**Reference**

- [`AbstractionDemo.java`](./AbstractionDemo.java)
