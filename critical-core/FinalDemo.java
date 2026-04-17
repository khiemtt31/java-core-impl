/**
 * Demonstrates what final means for variables, methods, classes, and references.
 * Why: final is a common interview topic and is often confused with immutability.
 * How: this demo shows final fields, a final method, a final class, and a mutable object held by a final reference.
 */
public final class FinalDemo {

    private static final String COURSE_NAME = "Java Critical Core";

    private final String learnerName;

    /**
     * Creates a final-backed demo instance.
     * Why: final instance fields must be assigned exactly once.
     * How: the constructor initializes the field.
     */
    public FinalDemo(String learnerName) {
        this.learnerName = learnerName;
    }

    /**
     * Runs the final demo from the command line.
     * Why: this keeps the example easy to execute in isolation.
     * How: prints a final variable, uses a final method, and shows the difference between final and immutability.
     */
    public static void run() {
        FinalDemo demo = new FinalDemo("student");

        FinalDemo demo2 = new FinalDemo("student2");

        // COURSE_NAME = "Heelo"; --- cannot reassign to final variable

        demo2 = new FinalDemo("student3"); // FinalDemo demo2 is not final so it can be reassigned value

        System.out.println("Final constant: " + COURSE_NAME);
        System.out.println(demo.describe());
        System.out.println(demo.showFinalReference());
        System.out.println(demo2.describe());
        System.out.println(demo2.showFinalReference());
        System.out.println("Final class example: " + new FinalToken("done").value());
    }

    /**
     * Returns a description using a final instance field.
     * Why: final methods cannot be overridden in subclasses.
     * How: the method reads the final state set by the constructor.
     */
    public final String describe() {
        return "Learner name = " + learnerName;
    }

    /**
     * Shows that a final reference can still point to a mutable object.
     * Why: final protects the reference, not the object state.
     * How: a StringBuilder can change even when the reference is final.
     */
    public String showFinalReference() {
        final StringBuilder builder = new StringBuilder("Java");
        builder.append(" Core");
        return "Final reference result = " + builder;
    }

    /**
     * Entry point for running the demo directly.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * A final nested class cannot be subclassed.
     */
    public static final class FinalToken {

        private final String value;

        public FinalToken(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

//class Child extends FinalDemo {} --- cannot extend final classes