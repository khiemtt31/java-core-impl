/**
 * Introduces Java wrapper classes and why they matter.
 * Why: wrappers are required in collections, APIs that need nullability, and many framework integrations.
 * How: the demo uses common wrapper types, parsing, and a nullable value.
 */
public final class WrapperClassesDemo {

    /**
     * Runs the wrapper class example from the command line.
     * Why: the same code can be used on its own or from the master app.
     * How: delegates to {@link #run()}.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Demonstrates the practical use of wrapper classes.
     * Why: wrapper classes are objects, so they can be stored in collections and set to null.
     * How: shows common wrappers, parsing, and null handling.
     */
    public static void run() {
        Integer age = 25;
        Double height = 1.82;
        Boolean active = Boolean.TRUE;
        Character grade = 'A';

        Integer parsedValue = Integer.valueOf("42");
        Integer nullableScore = null;

        System.out.println("Integer age: " + age);
        System.out.println("Double height: " + height);
        System.out.println("Boolean active: " + active);
        System.out.println("Character grade: " + grade);
        System.out.println("Parsed Integer: " + parsedValue);
        System.out.println("Nullable wrapper value: " + nullableScore);
        System.out.println("Wrappers are useful when a value must behave like an object.");
    }
}
