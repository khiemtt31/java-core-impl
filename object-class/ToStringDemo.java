/**
 * Shows why toString() should return readable object state.
 * Why: logs, debugging, and console output are easier to understand with a useful string representation.
 * How: compares Object's default identity-style output with a custom override.
 */
public final class ToStringDemo {

    /**
     * Runs the toString example from the command line.
     * Why: this keeps the example easy to execute in isolation.
     * How: delegates to {@link #run()} so the same logic can be reused by the master app.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the toString comparison.
     * Why: the difference is easier to remember when you see both outputs side by side.
     * How: prints one object without an override and one object with a readable override.
     */
    public static void run() {
        DefaultProfile rawProfile = new DefaultProfile("Asha", "backend engineer");
        Profile profile = new Profile("Asha", "backend engineer");

        System.out.println("Default Object.toString(): " + rawProfile);
        System.out.println("Custom toString(): " + profile);
        System.out.println("println(object) calls toString() for you.");
        System.out.println("A good toString() makes logs and debugging much easier.");
    }

    /**
     * Represents an object that relies on Object's default toString().
     * Why: it shows the unreadable identity-style output that callers usually want to replace.
     * How: keeps the inherited implementation untouched.
     */
    static final class DefaultProfile {
        private final String name;
        private final String role;

        /**
         * Creates a profile without a custom string representation.
         * Why: the demo needs a baseline for comparison.
         * How: stores the state in fields.
         */
        DefaultProfile(String name, String role) {
            this.name = name;
            this.role = role;
        }
    }

    /**
     * Represents a profile with a readable string representation.
     * Why: useful text helps humans understand the object state quickly.
     * How: formats the important fields in a compact sentence.
     */
    static final class Profile {
        private final String name;
        private final String role;

        /**
         * Creates a profile with a custom string representation.
         * Why: the fields should be visible in logs and console output.
         * How: stores the fields for later formatting.
         */
        Profile(String name, String role) {
            this.name = name;
            this.role = role;
        }

        /**
         * Formats the object state in a readable way.
         * Why: debug output should reveal meaning, not memory identity.
         * How: returns the fields in a structured string.
         */
        @Override
        public String toString() {
            return "Profile{name='" + name + "', role='" + role + "'}";
        }
    }
}
