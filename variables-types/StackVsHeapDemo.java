/**
 * Explains where variables and objects live in the JVM model.
 * Why: stack vs heap is a common follow-up after primitives vs references.
 * How: the demo uses local variables, objects, and arrays to show what gets copied and what gets shared.
 */
public final class StackVsHeapDemo {

    /**
     * Runs the stack vs heap example from the command line.
     * Why: this keeps the topic independently runnable.
     * How: delegates to {@link #run()}.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Demonstrates conceptual stack and heap placement.
     * Why: Java does not expose raw memory addresses, so the demo focuses on observable behavior.
     * How: local variables hold primitive values or references, while objects and arrays live on the heap.
     */
    public static void run() {
        int chapterCount = 3;
        Book book = new Book("Effective Java", chapterCount);
        int[] notes = {1, 2, 3};

        System.out.println("Local primitive value: " + chapterCount);
        System.out.println("Book reference points to: " + book);
        System.out.println("Array reference points to: " + arraySummary(notes));
        System.out.println("identityHashCode(book): " + System.identityHashCode(book));

        Book anotherReference = book;
        anotherReference.setTitle("Effective Java, 3rd Edition");

        System.out.println("Original book after alias mutation: " + book);
        System.out.println("Another reference: " + anotherReference);
        System.out.println("Both references point to the same heap object.");
    }

    /**
     * Builds a compact string for array output.
     * Why: array default printing is not beginner friendly.
     * How: formats the length and the first values.
     */
    private static String arraySummary(int[] values) {
        return "int[" + values.length + "]";
    }

    /**
     * Represents a heap object with mutable fields.
     * Why: mutability makes the heap/shared-reference behavior visible.
     * How: the fields are updated through instance methods.
     */
    static final class Book {
        private String title;
        private final int chapters;

        /**
         * Creates a book object.
         * Why: a constructor gives the object state from the start.
         * How: stores title and chapter count in instance fields.
         */
        Book(String title, int chapters) {
            this.title = title;
            this.chapters = chapters;
        }

        /**
         * Updates the title field.
         * Why: mutating the object helps demonstrate heap sharing.
         * How: writes the new title to the instance field.
         */
        void setTitle(String title) {
            this.title = title;
        }

        /**
         * Formats the object for output.
         * Why: readable output shows the current object state.
         * How: returns a compact string with all fields.
         */
        @Override
        public String toString() {
            return "Book{title='" + title + "', chapters=" + chapters + "}";
        }
    }
}
