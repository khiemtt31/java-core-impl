/**
 * Shows abstraction through abstract classes and interfaces.
 * Why: abstraction focuses on what an object does, not every implementation detail.
 * How: a report template shares behavior, while an exportable contract defines a capability.
 */
public final class AbstractionDemo {

    /**
     * Runs the abstraction example from the command line.
     * Why: this makes the topic runnable on its own.
     * How: delegates to {@link #run()} so the same logic can be reused by the master app.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the abstraction example.
     * Why: abstraction hides the how and exposes the what.
     * How: shows an abstract base class plus an interface-based capability.
     */
    public static void run() {
        SalesReport report = new SalesReport("Q1 Sales");
        report.print();

        Exportable exportable = report;
        System.out.println("Export format: " + exportable.format());
        System.out.println("Export data: " + exportable.export());

        System.out.println("Abstract class is best for shared state and partial implementation.");
        System.out.println("Interface is best for a capability that can be mixed into many classes.");
    }

    /**
     * A shared report template.
     * Why: abstract classes can hold state and common behavior.
     * How: subclasses provide the specific body content.
     */
    static abstract class Report {
        private final String title;

        /**
         * Creates a report with a title.
         * Why: shared state belongs in the base type.
         * How: stores the title in a private field.
         */
        Report(String title) {
            this.title = title;
        }

        /**
         * Prints the report.
         * Why: the base class can define the overall flow.
         * How: calls a subclass hook for the body.
         */
        public void print() {
            System.out.println("Report: " + title);
            System.out.println(body());
        }

        /**
         * Builds the report body.
         * Why: subclasses customize the missing piece.
         * How: forces each child to provide the content.
         */
        protected abstract String body();
    }

    /**
     * A concrete report example.
     * Why: one subclass can supply the custom body for the abstract flow.
     * How: returns a simple sales summary.
     */
    static final class SalesReport extends Report implements Exportable {
        /**
         * Creates a sales report.
         * Why: the parent constructor sets the shared title.
         * How: passes the title upward.
         */
        SalesReport(String title) {
            super(title);
        }

        /**
         * Supplies the report body.
         * Why: abstract classes define the contract for missing pieces.
         * How: returns a report string.
         */
        @Override
        protected String body() {
            return "Sales improved by 18%.";
        }

        /**
         * Returns the export format.
         * Why: interfaces work well for capabilities.
         * How: returns a constant format label.
         */
        @Override
        public String format() {
            return "TEXT";
        }

        /**
         * Returns the export payload.
         * Why: the same class can expose an independent capability.
         * How: delegates to the report body.
         */
        @Override
        public String export() {
            return body();
        }
    }

    /**
     * A capability contract.
     * Why: interfaces describe behavior without requiring shared state.
     * How: any class can implement the methods.
     */
    interface Exportable {
        /**
         * Returns the export format.
         * Why: callers can depend on the contract, not the implementation.
         * How: each implementer chooses the format.
         */
        String format();

        /**
         * Exports the content.
         * Why: the interface captures the capability itself.
         * How: each implementer returns its payload.
         */
        String export();
    }
}
