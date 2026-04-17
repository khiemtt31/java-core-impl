/**
 * Runs every OOP Concepts example in one place.
 * Why: interview prep is easier when the topics are executed in the same order as the checklist.
 * How: this class delegates to focused demo classes so each concept stays isolated and easy to study.
 */
public final class OopConceptsApp {

    /**
     * Starts the learning flow from the command line.
     * Why: a single entry point lets you verify the whole section quickly.
     * How: prints a section header and calls each demo in checklist order.
     */
    public static void main(String[] args) {
        printSection("Encapsulation");
        EncapsulationDemo.run();

        printSection("Inheritance");
        InheritanceDemo.run();

        printSection("Polymorphism");
        PolymorphismDemo.run();

        printSection("Abstraction");
        AbstractionDemo.run();
    }

    /**
     * Prints a readable separator before each demo.
     * Why: it keeps the console output aligned with the learning flow.
     * How: writes a blank line and a decorated title.
     */
    private static void printSection(String title) {
        System.out.println();
        System.out.println("==== " + title + " ====");
    }
}
