/**
 * Runs every Set example in one place.
 * Why: a single entry point makes it easy to review the section in checklist order.
 * How: delegates to focused demos so each topic stays isolated.
 */
public final class SetApp {

    /**
     * Starts the Set learning flow from the command line.
     * Why: this gives you a quick smoke test for the section.
     * How: prints a separator before each demo and calls its run() method.
     */
    public static void main(String[] args) {
        printSection("HashSet");
        HashSetDemo.run();

        printSection("LinkedHashSet");
        LinkedHashSetDemo.run();

        printSection("TreeSet");
        TreeSetDemo.run();
    }

    /**
     * Prints a readable separator before each demo.
     * Why: the console output is easier to scan when topics are visually grouped.
     * How: writes a blank line and a title line.
     */
    private static void printSection(String title) {
        System.out.println();
        System.out.println("==== " + title + " ====");
    }
}
