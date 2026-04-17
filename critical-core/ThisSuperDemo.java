/**
 * Demonstrates this(), super(), constructor chaining, and overriding.
 * Why: these keywords are often asked together in interviews.
 * How: this demo uses a parent class and a child class with overloaded constructors.
 */
public final class ThisSuperDemo {

    /**
     * Runs the this/super demo from the command line.
     * Why: it keeps the example easy to execute in isolation.
     * How: creates a child object and prints the constructor and override behavior.
     */
    public static void run() {
        Child child = new Child("Asha");
        System.out.println(child.describe());
        System.out.println(child.greet());
    }

    /**
     * Entry point for running the demo directly.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Parent class used to demonstrate super().
     */
    static class Parent {

        private final String name;

        Parent(String name) {
            this.name = name;
        }

        String greet() {
            return "Parent greeting for " + name;
        }
    }

    /**
     * Child class used to demonstrate this() chaining and method overriding.
     */
    static class Child extends Parent {

        private final int level;

        Child(String name) {
            this(name, 1);
        }

        Child(String name, int level) {
            super(name);
            this.level = level;
        }

        @Override
        String greet() {
            return super.greet() + " at level " + this.level;
        }

        String describe() {
            return "Constructor chaining used this() then super()";
        }
    }
}
