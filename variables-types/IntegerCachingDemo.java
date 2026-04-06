/**
 * Demonstrates Integer caching and why `==` can be misleading with wrappers.
 * Why: caching is an interview favorite and explains surprising comparison results.
 * How: compares cached and non-cached Integer instances with both `==` and `equals`.
 */
public final class IntegerCachingDemo {

    /**
     * Runs the Integer caching example from the command line.
     * Why: the behavior is best remembered by seeing the output.
     * How: delegates to {@link #run()}.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Shows how Integer caching affects identity comparison.
     * Why: wrapper caching reduces object creation for common values.
     * How: compares values inside and outside the default cache range.
     */
    public static void run() {
        Integer cachedA = 127;
        Integer cachedB = 127;
        Integer uncachedA = 128;
        Integer uncachedB = 128;

        System.out.println("127 == 127: " + (cachedA == cachedB));
        System.out.println("127.equals(127): " + cachedA.equals(cachedB));
        System.out.println("128 == 128: " + (uncachedA == uncachedB));
        System.out.println("128.equals(128): " + uncachedA.equals(uncachedB));
        System.out.println("Use equals() for value comparison, not ==, when working with wrappers.");
    }
}
