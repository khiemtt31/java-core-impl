import java.util.ArrayList;
import java.util.List;

/**
 * Shows why ArrayList is the default choice for most List work.
 * Why: interview questions often start with "when should I use ArrayList?"
 * How: the demo reads by index, inserts in the middle, and removes an element to show the shifting cost.
 */
public final class ArrayListDemo {

    /**
     * Runs the ArrayList example from the command line.
     * Why: each topic stays runnable on its own.
     * How: delegates to {@link #run()} so the same logic can be reused by the master app.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the ArrayList behavior demo.
     * Why: indexed reads and append-heavy workflows are the common ArrayList use case.
     * How: prints the list before and after indexed operations.
     */
    public static void run() {
        List<String> groceries = new ArrayList<>();
        groceries.add("Milk");
        groceries.add("Eggs");
        groceries.add("Bread");

        List<StringBuilder> animaSquad = new ArrayList<StringBuilder>();
        animaSquad.add(new StringBuilder("More"));
        animaSquad.add(new StringBuilder("More"));
        animaSquad.add(new StringBuilder("More"));

        System.out.println("Is Same: " + (animaSquad.get(2).toString().contentEquals(animaSquad.getFirst())));
        System.out.println("Is String: " + animaSquad.getFirst().toString());

        System.out.println("Initial ArrayList: " + groceries);
        System.out.println("Random access with get(1): " + groceries.get(1));

        groceries.add(1, "Butter");
        System.out.println("After insert at index 1: " + groceries);
        System.out.println("Inserting in the middle shifts later elements to the right.");

        groceries.removeFirst();
        System.out.println("After remove at index 0: " + groceries);
        System.out.println("ArrayList is usually best when you read by index often and mostly add at the end.");
    }
}
