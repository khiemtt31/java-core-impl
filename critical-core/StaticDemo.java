/**
 * Demonstrates how static members belong to the class rather than an individual object.
 * Why: static is one of the first interview topics after variables and types.
 * How: this demo shows a static variable, a static block, a static method, and a static nested class.
 */
public final class StaticDemo {

    private static int createdCount;
    private static final String STATIC_MESSAGE;

    static {
        STATIC_MESSAGE = "initialized once by the static block";
    }

    private final String name;

    /**
     * Creates one demo instance.
     * Why: instance fields let you compare per-object state with shared static state.
     * How: each construction increases the shared counter.
     */
    public StaticDemo(String name) {
        this.name = name;
        createdCount++;
    }

    /**
     * Runs the static demo from the command line.
     * Why: this keeps the example easy to execute in isolation.
     * How: creates two instances and prints both shared and instance state.
     */
    public static void run() {
        System.out.println("Static message: " + STATIC_MESSAGE);
        System.out.println("Created count before objects: " + createdCount);

        StaticDemo first = new StaticDemo("first");
        StaticDemo second = new StaticDemo("second");

        System.out.println(first.describe());
        System.out.println(second.describe());
        System.out.println("Created count after objects: " + createdCount);
        System.out.println(Helper.format("shared counter", createdCount));
        System.out.println("Static method can read static state: " + getCreatedCount());
    }

    /**
     * Returns the shared counter.
     * Why: static methods operate on class state, not object state.
     * How: reads the static variable directly.
     */
    public static int getCreatedCount() {
        return createdCount;
    }

    /**
     * Describes this single object.
     * Why: instance methods can access both static and instance members.
     * How: combines the object name with the shared count.
     */
    public String describe() {
        return "Instance name = " + name + ", shared count = " + createdCount;
    }

    /**
     * Shows how a static nested class can be used without creating an outer instance.
     */
    public static final class Helper {

        /**
         * Formats a label and value for console output.
         */
        public static String format(String label, int value) {
            return label + " = " + value;
        }
    }

    /**
     * Entry point for running the demo directly.
     */
    public static void main(String[] args) {
        run();
    }
}
