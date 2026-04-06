/**
 * Shows the difference between primitive values and reference values.
 * Why: the first interview trap is treating primitives and objects as if they behave the same on assignment.
 * How: the demo copies a primitive, aliases an object reference, and then mutates the object through one alias.
 */
public final class PrimitiveVsReferenceDemo {

    /**
     * Runs the primitive vs reference example from the command line.
     * Why: this makes the topic runnable on its own.
     * How: delegates to {@link #run()} so the same logic can be reused by the master app.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the primitive and reference comparisons.
     * Why: seeing the before-and-after values makes the assignment behavior obvious.
     * How: first use an int, then use a mutable Person object.
     */
    public static void run() {
        int primitiveA = 10;
        int primitiveB = primitiveA;
        primitiveB = 99;

        System.out.println("Primitive A: " + primitiveA);
        System.out.println("Primitive B: " + primitiveB);
        System.out.println("Primitive assignment copies the value, so A stays 10.");

        Person alice = new Person("Alice");
        Person bob = alice;
        bob.setName("Bob");

        System.out.println("Alice after Bob mutates the shared object: " + alice);
        System.out.println("Bob points to the same object: " + bob);
        System.out.println("Reference assignment copies the reference value, so both variables see the same object.");

        Person charlie = alice;
        charlie = new Person("Charlie");

        System.out.println("Alice after Charlie is reassigned: " + alice);
        System.out.println("Charlie after reassignment: " + charlie);
        System.out.println("Reassigning a reference does not change the original object.");
    }

    /**
     * Represents a mutable object used to show how reference types behave.
     * Why: object fields can be changed through any alias that points to the same object.
     * How: the `name` field is updated through a setter.
     */
    static final class Person {
        private String name;

        /**
         * Creates a person with a name.
         * Why: the demo needs a visible field to mutate.
         * How: stores the name in an instance field.
         */
        Person(String name) {
            this.name = name;
        }

        /**
         * Updates the person's name.
         * Why: changing object state is the easiest way to see shared references.
         * How: writes the new value to the backing field.
         */
        void setName(String name) {
            this.name = name;
        }

        /**
         * Formats the object state for console output.
         * Why: readable output is better than default object identity text.
         * How: returns the current field value as a string.
         */
        @Override
        public String toString() {
            return "Person{name='" + name + "'}";
        }
    }
}
