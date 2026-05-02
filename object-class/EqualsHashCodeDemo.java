import java.util.HashSet;
import java.util.Objects;

/**
 * Shows why equals() and hashCode() must work together.
 * Why: logical equality matters in collections that use hashing.
 * How: compares objects that rely on Object defaults with objects that override both methods.
 */
public final class EqualsHashCodeDemo {

    /**
     * Runs the equals/hashCode example from the command line.
     * Why: this keeps the example easy to execute in isolation.
     * How: delegates to {@link #run()} so the same logic can be reused by the master app.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the equals/hashCode comparison.
     * Why: seeing both the raw and value-based behavior makes the contract memorable.
     * How: compares two objects with the same data before and after overriding both methods.
     */
    public static void run() {
        RawOrder rawFirst = new RawOrder(101, "Notebook");
        RawOrder rawSecond = new RawOrder(101, "Notebook");

        HashSet<RawOrder> rawOrders = new HashSet<>();
        rawOrders.add(rawFirst);
        rawOrders.add(rawSecond);

        System.out.println("RawOrder equals(): " + rawFirst.equals(rawSecond));
        System.out.println("RawOrder hash codes: " + rawFirst.hashCode() + " and " + rawSecond.hashCode());
        System.out.println("RawOrder HashSet size: " + rawOrders.size());
        System.out.println("RawOrder contains equal-looking value? " + rawOrders.contains(new RawOrder(101, "Notebook")));
        System.out.println("Without overrides, two objects with the same data still count as different.");

        System.out.println();

        Order first = new Order(101, "Notebook");
        Order second = new Order(101, "Notebook");

        HashSet<Order> orders = new HashSet<>();
        orders.add(first);
        orders.add(second);

        System.out.println("Order equals(): " + first.equals(second));
        System.out.println("Order hash codes: " + first.hashCode() + " and " + second.hashCode());
        System.out.println("Order HashSet size: " + orders.size());
        System.out.println("Order contains equal-looking value? " + orders.contains(new Order(101, "Notebook")));
        System.out.println("Equal objects must return the same hash code so HashSet can find them in the same bucket.");
    }

    /**
     * Represents a value object that still uses Object's default identity behavior.
     * Why: it shows what happens when equals() and hashCode() are not overridden.
     * How: leaves the inherited methods untouched.
     */
    static final class RawOrder {
        private final int id;
        private final String item;

        /**
         * Creates a raw order value.
         * Why: the demo needs two identical-looking objects.
         * How: stores the fields without adding custom equality logic.
         */
        RawOrder(int id, String item) {
            this.id = id;
            this.item = item;
        }
    }

    /**
     * Represents a value object with proper equality and hashing.
     * Why: this is the behavior hash-based collections expect.
     * How: compares the significant fields and hashes the same fields.
     */
    static final class Order {
        private final int id;
        private final String item;

        /**
         * Creates an order for the value-based example.
         * Why: the fields define the logical identity of the object.
         * How: stores the fields for later comparison.
         */
        Order(int id, String item) {
            this.id = id;
            this.item = item;
        }

        /**
         * Compares orders by logical content instead of object identity.
         * Why: two separate instances can still represent the same real-world value.
         * How: compares the significant fields after the standard type checks.
         */
        @Override
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Order)) {
                return false;
            }
            Order order = (Order) other;
            return id == order.id && Objects.equals(item, order.item);
        }

        /**
         * Produces a hash code that matches the equality fields.
         * Why: equal objects must have equal hash codes.
         * How: combines the same fields used by equals().
         */
        @Override
        public int hashCode() {
            return Objects.hash(id, item);
        }
    }
}
