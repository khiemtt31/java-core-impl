import java.util.Set;
import java.util.TreeSet;

/**
 * Shows that TreeSet keeps values sorted.
 * Why: TreeSet is the Set you choose when natural ordering matters.
 * How: inserts values out of order and prints the sorted result.
 */
public final class TreeSetDemo {

    /**
     * Runs the TreeSet example from the command line.
     * Why: the topic should be runnable on its own.
     * How: delegates to {@link #run()} so the master app can reuse it.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the TreeSet behavior demo.
     * Why: sorted unique output is the main TreeSet behavior to remember.
     * How: adds unsorted values, including a duplicate, and prints the natural order.
     */
    public static void run() {
        TreeSet<String> words = new TreeSet<>();

        Set<Integer> set = new TreeSet<>();

        System.out.println(set.add(1));
        System.out.println(set.add(2));
        System.out.println(set.add(1));

        words.add("banana");
        words.add("apple");
        words.add("cherry");
        words.add("cherry");
        words.add("cherry");
        words.add("mayhem");

        System.out.println("TreeSet contents: " + words);
        System.out.println("TreeSet contents: " + words.size());
        System.out.println("TreeSet sorts values automatically and removes duplicate apple.");
        System.out.println("First: " + words.first());
        System.out.println("Last: " + words.last());
    }
}
