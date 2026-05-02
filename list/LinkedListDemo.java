import java.util.LinkedList;

/**
 * Shows when LinkedList can be useful in a List question.
 * Why: LinkedList appears in interview comparisons with ArrayList.
 * How: the demo uses addFirst, addLast, and an indexed insert to show the node-oriented style.
 */
public final class LinkedListDemo {

    /**
     * Runs the LinkedList example from the command line.
     * Why: the topic should be runnable on its own.
     * How: delegates to {@link #run()} so the master app can reuse it.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the LinkedList behavior demo.
     * Why: it is easiest to understand LinkedList through end operations and inserts.
     * How: adds and removes items from both ends, then inserts in the middle.
     */
    public static void run() {
        LinkedList<String> steps = new LinkedList<>();
        steps.addLast("Start");
        steps.addLast("Middle");
        steps.addLast("End");

        System.out.println("Initial LinkedList: " + steps);

        steps.addFirst("Prep");
        steps.addLast("Wrap up");
        System.out.println("After addFirst/addLast: " + steps);

        steps.add(2, "Review");
        System.out.println("After insert at index 2: " + steps);
        System.out.println("LinkedList still has to walk to the position before inserting there.");

        steps.removeFirst();
        steps.removeLast();
        System.out.println("After removing from both ends: " + steps);
        System.out.println("LinkedList is a better fit when you often add or remove near the ends, or already have an iterator at the position.");
    }
}
