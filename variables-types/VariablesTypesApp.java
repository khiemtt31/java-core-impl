/**
 * Runs every "Variables & Types" example in one place.
 * Why: interview prep is easier when the topics are executed in the same order as the checklist.
 * How: this class delegates to focused demo classes so each concept stays isolated and easy to study.
 */
public final class VariablesTypesApp {

    /**
     * Starts the learning flow from the command line.
     * Why: a single entry point lets you verify the whole section quickly.
     * How: prints a section header and calls each demo in checklist order.
     */
    public static void main(String[] args) {
        printSection("Primitive vs Reference Types");
        PrimitiveVsReferenceDemo.run();

        printSection("Stack vs Heap Memory");
        StackVsHeapDemo.run();

        printSection("Pass By Value");
        PassByValueDemo.run();

        printSection("Autoboxing / Unboxing");
        AutoboxingUnboxingDemo.run();

        printSection("Wrapper Classes");
        WrapperClassesDemo.run();

        printSection("Integer Caching");
        IntegerCachingDemo.run();
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
