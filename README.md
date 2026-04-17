## Java Core Mastery Plan (Interview-Level Checklist)

This is a **structured roadmap** from fundamentals → collections → advanced internals.
Use this as a **daily checklist** and **self-testing prompts**.

---

# Phase 1 — Java Language Fundamentals (Must Master First)

## 1. Variables & Types [ ✔️ ] FINISHED

Runnable examples and explanations live in [`variables-types/`](./variables-types/).

**Checklist**

* [ ✔️ ] Primitive vs Reference types => primitives store value directly, references store address to heap object
* [ ✔️ ] Stack vs Heap memory => stack is for method calls and local variables, heap is for objects and arrays
* [ ✔️ ] Pass by value (important interview topic)
* [ ✔️ ] Autoboxing / Unboxing => automatic conversion between primitives and wrapper classes, convenient but can hide performance costs and null-related errors
* [ ✔️ ] Wrapper classes => Integer, Double, etc. that wrap primitive values and provide utility methods and they allows null values but can cause NullPointerException when unboxed

**Self-Test Prompts**

* Why is Java always pass-by-value? -> because Java always passes a copy of the variable, whether it's a primitive (copy of value) or reference (copy of address)
* What happens when you pass an object to a method? -> A copy of the reference is passed, so both the original and the parameter point to the same object in memory
* Why Integer caching exists? -> To improve performance by reusing frequently used Integer objects within the range of -128 to 127

---

## 2. `static`, `final`, `this`, `super` (Critical Core)

Runnable examples and explanations live in [`critical-core/`](./critical-core/).

### static

**Checklist**

* [ ✔️ ] static variable
* [ ✔️ ] static method
* [ ✔️ ] static block
* [ ✔️ ] static nested class
* [ ✔️ ] static vs instance

**Self-Test Prompts**

* When is static variable initialized? -> when the class is loaded
* Can static method access instance variables? -> No, because static methods belong to the class, not an instance
* Why is `main()` static? -> because it needs to be called by the JVM without creating an instance of the class

---

### final

**Checklist**

* [ ✔️ ] final variable
* [ ✔️ ] final method
* [ ✔️ ] final class
* [ ✔️ ] final vs immutability

**Self-Test Prompts**

* final object vs immutable object difference? -> A final object cannot be reassigned to point to a different object, but its internal state can still be changed if it's mutable. An immutable object cannot have its internal state changed after it's created, regardless of whether it's final or not.
* Why String is immutable? -> To improve performance and security, because immutable objects can be safely shared and cached without worrying about changes to their state

---

### this & super

**Checklist**

* [ ✔️ ] this keyword
* [ ✔️ ] super keyword
* [ ✔️ ] constructor chaining
* [ ✔️ ] method overriding

**Self-Test Prompts**

* When use `this()` vs `super()`? -> `this()` is used to call another constructor in the same class, while `super()` is used to call a constructor in the parent class. They cannot be used together in the same constructor because both must be the first statement if they are used.
* Can we call both in constructor? -> No, because both `this()` and `super()` must be the first statement in a constructor, so you cannot call both in the same constructor.

---

# Phase 2 — OOP

## 3. OOP Concepts [ ✔️ ] FINISHED

Runnable examples and explanations live in [`oop-concepts/`](./oop-concepts/).

**Checklist**

* [ ✔️ ] Encapsulation
* [ ✔️ ] Inheritance
* [ ✔️ ] Polymorphism
* [ ✔️ ] Abstraction

**Self-Test Prompts**

* Method overloading vs overriding? -> Overloading is compile-time polymorphism with the same method name but different parameters; overriding is runtime polymorphism where a subclass replaces a parent method.
* Abstract class vs interface? -> Use an abstract class when you need shared state or common implementation; use an interface when you need a contract that multiple unrelated classes can implement.
* When to use interface? -> Use an interface when you want a capability, multiple implementations, or loose coupling without shared state.

---

## 4. Object Class (Very Important)

**Checklist**

* [ ] equals()
* [ ] hashCode()
* [ ] toString()
* [ ] clone()

**Self-Test Prompts**

* Why override hashCode with equals?
* What happens if not override?

---

# Phase 3 — Collections Framework (MOST IMPORTANT)

## 5. List

**Checklist**

* [ ] ArrayList
* [ ] LinkedList
* [ ] Vector (basic knowledge)

**Self-Test Prompts**

* ArrayList vs LinkedList?
* Which one faster for insert?

---

## 6. Set

**Checklist**

* [ ] HashSet
* [ ] LinkedHashSet
* [ ] TreeSet

**Self-Test Prompts**

* Why HashSet uses HashMap?
* HashSet allow duplicates?

---

## 7. Map (VERY IMPORTANT)

**Checklist**

* [ ] HashMap
* [ ] LinkedHashMap
* [ ] TreeMap
* [ ] Hashtable (basic)

**Self-Test Prompts**

* HashMap internal working?
* Why HashMap not thread-safe?
* HashMap vs ConcurrentHashMap?

---

## 8. Queue / Deque

**Checklist**

* [ ] Queue
* [ ] PriorityQueue
* [ ] Deque
* [ ] ArrayDeque

**Self-Test Prompts**

* Queue vs Deque?
* Why ArrayDeque faster than Stack?

---

# Phase 4 — HashMap Deep Understanding (Interview Favorite)

## Must Know

**Checklist**

* [ ] Hashing concept
* [ ] Hash collision
* [ ] Load factor
* [ ] Rehashing
* [ ] Bucket
* [ ] Treeify (Java 8)

**Self-Test Prompts**

* How HashMap works internally?
* What happens when collision occurs?
* Why Java 8 uses TreeMap inside bucket?

---

# Phase 5 — String & Immutability

## Checklist

* [ ] String
* [ ] StringBuilder
* [ ] StringBuffer
* [ ] String pool

**Self-Test Prompts**

* String vs StringBuilder?
* Why String immutable?
* What is String pool?

---

# Phase 6 — Exception Handling

## Checklist

* [ ] try-catch
* [ ] finally
* [ ] throw vs throws
* [ ] checked vs unchecked exception

**Self-Test Prompts**

* Can finally not execute?
* checked vs unchecked?

---

# Phase 7 — Multithreading (Important for Senior Level)

## Checklist

* [ ] Thread
* [ ] Runnable
* [ ] Synchronization
* [ ] volatile
* [ ] ExecutorService

**Self-Test Prompts**

* synchronized vs volatile?
* Thread vs Runnable?

---

# Phase 8 — Java Memory Model (Advanced but Important)

## Checklist

* [ ] Stack vs Heap
* [ ] Method area
* [ ] GC
* [ ] Memory leaks

---

# Interview Priority Ranking

If time limited, learn in this order:

1. HashMap
2. Collections
3. static / final
4. OOP
5. String
6. Exception
7. Multithreading

---

# Daily Learning Plan (Recommended)

## Week 1

* Day 1 — static / final
* Day 2 — OOP
* Day 3 — Object class
* Day 4 — String
* Day 5 — Exception
* Day 6 — Collections (List)
* Day 7 — Collections (Set)

## Week 2

* Day 8 — HashMap deep dive
* Day 9 — TreeMap / LinkedHashMap
* Day 10 — Queue / Deque
* Day 11 — Multithreading basics
* Day 12 — Java Memory Model
* Day 13 — Practice
* Day 14 — Mock interview

---

# Practice Questions (Must Solve)

* Implement HashMap manually
* LRU Cache (LinkedHashMap)
* Frequency counter (HashMap)
* Remove duplicates (HashSet)
* Top K Elements (PriorityQueue)

---

# Final Mastery Checklist

You mastered Java Core if you can explain:

* How HashMap works internally
* static vs final
* equals vs hashCode
* ArrayList vs LinkedList
* HashSet vs TreeSet
* String immutable
* Stack vs Heap

---

Given your goal (strong software engineer role), your **top priority** should be:

1. HashMap
2. Collections
3. Memory model
4. Multithreading

These are heavily tested in interviews.

If useful, I can also provide:

* 7-day crash plan
* Interview questions list
* Java core roadmap to senior level
