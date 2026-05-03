import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Shows that LinkedHashSet keeps insertion order.
 * Why: LinkedHashSet is the Set you choose when order matters but duplicates still should not exist.
 * How: inserts values in a known order and prints the result.
 */
public final class LinkedHashSetDemo {

    /**
     * Runs the LinkedHashSet example from the command line.
     * Why: the topic should be runnable on its own.
     * How: delegates to {@link #run()} so the master app can reuse it.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the LinkedHashSet behavior demo.
     * Why: insertion order is the point of LinkedHashSet.
     * How: adds values in a fixed order, including a duplicate, and prints the final iteration order.
     */
    public static void run() {
        LinkedHashSet<String> topics = new LinkedHashSet<>();

        Set<Integer> set = new LinkedHashSet<>();
        System.out.println("LinkedHashSet set of SET contents: " + set.add(1));
        System.out.println("LinkedHashSet set of SET contents: " + set.add(1));
        System.out.println("LinkedHashSet set of SET contents: " + set.add(1));


        topics.add("Java");
        topics.add("Collections");
        topics.add("Set");
        topics.add("Java");

        System.out.println("LinkedHashSet contents: " + topics + " ---- " + set);
        System.out.println("LinkedHashSet keeps the first-seen order and ignores duplicate Java.");
    }
}
