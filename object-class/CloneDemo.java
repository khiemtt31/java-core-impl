/**
 * Shows how clone() creates a shallow copy.
 * Why: clone() is part of Object, but it is easy to misunderstand because nested mutable state is shared unless you deep copy it.
 * How: clones a notebook and then mutates shared internal state to reveal the shallow-copy behavior.
 */
public final class CloneDemo {

    /**
     * Runs the clone example from the command line.
     * Why: this keeps the example easy to execute in isolation.
     * How: delegates to {@link #run()} so the same logic can be reused by the master app.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the clone comparison.
     * Why: seeing the original and clone change together makes shallow copying obvious.
     * How: clones a mutable object and then mutates one of its nested fields.
     */
    public static void run() {
        Notebook original = new Notebook("Java interview", new StringBuilder("equals"));
        Notebook copy = original.clone();

        System.out.println("Original before change: " + original);
        System.out.println("Clone before change:     " + copy);
        System.out.println("Same object? " + (original == copy));
        System.out.println("Same notes builder? " + (original.notes == copy.notes));

        copy.appendNote(", hashCode");

        System.out.println("Original after mutating the clone: " + original);
        System.out.println("Clone after mutating the clone:    " + copy);
        System.out.println("clone() copies the object, but mutable nested state is shared unless you deep copy it.");
    }

    /**
     * Represents a cloneable notebook with a mutable nested value.
     * Why: a mutable inner object makes the shallow-copy behavior easy to see.
     * How: uses Object.clone() and keeps the shared StringBuilder visible in the output.
     */
    static final class Notebook implements Cloneable {
        private final String title;
        private final StringBuilder notes;

        /**
         * Creates a notebook with a title and initial notes.
         * Why: the demo needs a mutable nested field to reveal shallow copying.
         * How: stores the provided state directly.
         */
        Notebook(String title, StringBuilder notes) {
            this.title = title;
            this.notes = notes;
        }

        /**
         * Adds text to the shared notes.
         * Why: mutating the nested object shows whether the clone was deep or shallow.
         * How: appends text to the StringBuilder.
         */
        void appendNote(String suffix) {
            notes.append(suffix);
        }

        /**
         * Creates a field-by-field copy of the notebook.
         * Why: Object.clone() is protected, so cloneable classes expose it through an override.
         * How: delegates to super.clone() and converts the checked exception into an assertion error.
         */
        @Override
        public Notebook clone() {
            try {
                return (Notebook) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        /**
         * Formats the notebook for readable console output.
         * Why: object identity text would hide the state we care about.
         * How: returns the title and notes in a compact string.
         */
        @Override
        public String toString() {
            return "Notebook{title='" + title + "', notes='" + notes + "'}";
        }
    }
}
