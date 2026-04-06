/**
 * Proves that Java is always pass-by-value.
 * Why: this is one of the most common interview questions and a frequent source of confusion.
 * How: the demo passes a primitive value, an object reference, and then a reassigned local copy of that reference.
 */
public final class PassByValueDemo {

    /**
     * Runs the pass-by-value example from the command line.
     * Why: the topic is easier to remember when it is executable.
     * How: delegates to {@link #run()}.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the pass-by-value demonstration.
     * Why: this shows the exact difference between mutating an object and reassigning a parameter.
     * How: compares a primitive update, object mutation, and parameter reassignment.
     */
    public static void run() {
        int primitive = 7;
        incrementPrimitive(primitive);
        System.out.println("Primitive after method call: " + primitive);

        Counter counter = new Counter(7);
        incrementCounter(counter);
        System.out.println("Counter after mutation: " + counter);

        replaceCounter(counter);
        System.out.println("Counter after reassignment inside method: " + counter);
        System.out.println("The caller sees the mutated object, but not the reassigned local parameter.");
    }

    /**
     * Increments a primitive copy.
     * Why: primitives are copied into the method parameter.
     * How: increments the local parameter only.
     */
    private static void incrementPrimitive(int value) {
        value++;
    }

    /**
     * Mutates the referenced object.
     * Why: the copied value is still a reference to the same object.
     * How: calls a mutating method on the shared object.
     */
    private static void incrementCounter(Counter counter) {
        counter.increment();
    }

    /**
     * Reassigns only the local parameter.
     * Why: this proves the caller's reference does not change when the parameter is reassigned.
     * How: points the local parameter to a new object and mutates that new object.
     */
    private static void replaceCounter(Counter counter) {
        counter = new Counter(100);
        counter.increment();
        System.out.println("Inside method after reassignment: " + counter);
    }

    /**
     * Mutable holder used to demonstrate object mutation.
     * Why: the state change makes pass-by-value visible.
     * How: stores an int and increments it through a method.
     */
    static final class Counter {
        private int value;

        /**
         * Creates a counter with an initial value.
         * Why: the demo needs a starting point.
         * How: stores the provided number in the field.
         */
        Counter(int value) {
            this.value = value;
        }

        /**
         * Increments the stored value.
         * Why: mutating the object shows that the same reference is shared.
         * How: adds one to the field.
         */
        void increment() {
            value++;
        }

        /**
         * Formats the counter for output.
         * Why: concise output keeps the demo readable.
         * How: returns the numeric value in braces.
         */
        @Override
        public String toString() {
            return "Counter{value=" + value + "}";
        }
    }
}
