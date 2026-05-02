import java.util.Vector;

/**
 * Shows the basic idea behind Vector.
 * Why: Vector still appears in interview checklists as legacy knowledge.
 * How: the demo shows it is a resizable list with synchronized methods and capacity growth.
 */
public final class VectorDemo {

    /**
     * Runs the Vector example from the command line.
     * Why: the topic should stay runnable in isolation.
     * How: delegates to {@link #run()} so the same logic can be reused by the master app.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the Vector behavior demo.
     * Why: basic knowledge of Vector is mostly about recognizing its legacy behavior.
     * How: prints size and capacity as elements are added.
     */
    public static void run() {
        Vector<String> backups = new Vector<>(2);

        System.out.println("Initial Vector size/capacity: " + backups.size() + "/" + backups.capacity());

        backups.add("One");
        backups.add("Two");
        System.out.println("After two adds: " + backups + " | size/capacity: " + backups.size() + "/" + backups.capacity());

        backups.addElement("Three");
        System.out.println("After adding one more element: " + backups + " | size/capacity: " + backups.size() + "/" + backups.capacity());
        System.out.println("Vector is a legacy synchronized list. Know it, but prefer ArrayList in modern single-threaded code.");
    }
}
