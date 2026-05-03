import java.util.HashSet;
import java.util.Set;

/**
 * Shows what HashSet does with duplicate values.
 * Why: interview questions often ask whether a Set allows duplicates.
 * How: adds repeated values and prints the return value and final contents.
 */
public final class HashSetDemo {

    /**
     * Runs the HashSet example from the command line.
     * Why: each topic stays runnable on its own.
     * How: delegates to {@link #run()} so the same logic can be reused by the master app.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the HashSet behavior demo.
     * Why: duplicate suppression is the key Set behavior to remember.
     * How: adds the same value more than once and shows that only unique values remain.
     */
    public static void run() {
        Set<String> names = new HashSet<>();
        Set<Integer> numbers = new HashSet<>();

        Set<String> hashSet = new HashSet<>();

        System.out.println(hashSet.add("Fall"));
        System.out.println(hashSet.add("Gravity"));
        System.out.println(hashSet.add("Style"));
        System.out.println(hashSet.add("Mate"));
        System.out.println(hashSet.add("King"));

        System.out.println("What is inside? : " + hashSet);

        System.out.println(numbers.add(3));
        System.out.println(numbers.add(3));
        System.out.println(numbers.add(3));
        System.out.println(numbers.add(3));

        System.out.println("Add Alice: " + names.add("Alice"));
        System.out.println("Add Bob: " + names.add("Bob"));
        System.out.println("Add Alice again: " + names.add("Alice"));
        System.out.println("HashSet contents: " + names);
        System.out.println("HashSet size: " + names.size());
        System.out.println("A Set keeps only unique values, so the duplicate Alice is ignored.");
    }
}
