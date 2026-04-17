# Encapsulation

**Question**

What is encapsulation? -> Keeps data safe inside a class and only lets them interact through methods.

**Answer**

Encapsulation means hiding data inside a class and exposing only safe methods to use it.
It protects object state, keeps rules in one place, and reduces accidental misuse.

In `EncapsulationDemo.java`, the `BankAccount` fields are private.
Callers must use `deposit()` and `withdraw()` instead of changing `balance` directly.

**Why it matters**

- protects invariants
- reduces coupling
- makes code easier to change later

**Reference**

- [`EncapsulationDemo.java`](./EncapsulationDemo.java)
