import java.util.ArrayList;
import java.util.List;

/**
 * Shows autoboxing and unboxing in real Java code.
 * Why: these conversions happen silently in collections, arithmetic, and method calls.
 * How: the demo stores primitives in wrapper collections and reads them back as primitives.
 */
public final class AutoboxingUnboxingDemo {

    /**
     * Runs the autoboxing and unboxing example from the command line.
     * Why: it keeps the topic independently executable.
     * How: delegates to {@link #run()}.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Demonstrates boxing, unboxing, and the null trap.
     * Why: interview answers should include both the convenience and the risk.
     * How: uses a List<Integer>, arithmetic, and a guarded null unboxing example.
     */
    public static void run() {
        List<Integer> scores = new ArrayList<>();
        scores.add(10);
        scores.add(20);

        int firstScore = scores.get(0);
        Integer totalScore = firstScore + scores.get(1);

        System.out.println("Scores: " + scores);
        System.out.println("First score after unboxing: " + firstScore);
        System.out.println("Total score after boxing the sum: " + totalScore);

        Integer maybeNull = null;
        try {
            int fail = maybeNull;
            System.out.println("This line will not execute: " + fail);
        } catch (NullPointerException ex) {
            System.out.println("Unboxing null throws NullPointerException.");
        }
    }
}
