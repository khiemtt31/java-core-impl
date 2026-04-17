/**
 * Shows polymorphism through overloading and overriding.
 * Why: the same method name can behave differently based on parameters or runtime type.
 * How: the demo uses overloads for compile-time polymorphism and shapes for runtime polymorphism.
 */
public final class PolymorphismDemo {

    /**
     * Runs the polymorphism example from the command line.
     * Why: this makes the topic runnable on its own.
     * How: delegates to {@link #run()} so the same logic can be reused by the master app.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the polymorphism example.
     * Why: one name, multiple behaviors.
     * How: first uses method overloading, then uses overridden methods through a base reference.
     */
    public static void run() {
        Calculator calculator = new Calculator();
        System.out.println("add(int, int): " + calculator.add(2, 3));
        System.out.println("add(double, double): " + calculator.add(2.5, 3.5));
        System.out.println("add(int, int, int): " + calculator.add(1, 2, 3));

        Shape[] shapes = {new Circle(2.0), new Rectangle(3.0, 4.0)};
        for (Shape shape : shapes) {
            System.out.println(shape.name() + " area: " + shape.area());
        }

        System.out.println("Overloading is resolved at compile time; overriding is resolved at runtime.");
    }

    /**
     * Demonstrates compile-time polymorphism through overloaded methods.
     * Why: the compiler picks the best match based on parameter types.
     * How: the method name stays the same while the signatures differ.
     */
    static final class Calculator {
        /**
         * Adds two integers.
         * Why: different parameter lists create different behaviors.
         * How: returns the integer sum.
         */
        int add(int left, int right) {
            return left + right;
        }

        /**
         * Adds two doubles.
         * Why: overloading can work across numeric types.
         * How: returns the double sum.
         */
        double add(double left, double right) {
            return left + right;
        }

        /**
         * Adds three integers.
         * Why: another signature shows the same name can support more cases.
         * How: returns the total sum.
         */
        int add(int first, int second, int third) {
            return first + second + third;
        }
    }

    /**
     * Base shape type used for runtime polymorphism.
     * Why: calling through the parent type still reaches the child override.
     * How: child classes provide their own area implementation.
     */
    static abstract class Shape {
        /**
         * Returns the shape name for console output.
         * Why: the demo needs readable labels.
         * How: child classes provide the label.
         */
        abstract String name();

        /**
         * Computes the shape area.
         * Why: each shape uses a different formula.
         * How: child classes override this method.
         */
        abstract double area();
    }

    /**
     * Circle provides one overridden area calculation.
     * Why: a subclass can customize behavior for its own data.
     * How: stores a radius and computes pi times radius squared.
     */
    static final class Circle extends Shape {
        private final double radius;

        /**
         * Creates a circle.
         * Why: the object needs a radius to calculate area.
         * How: stores the radius in a field.
         */
        Circle(double radius) {
            this.radius = radius;
        }

        /**
         * Returns the shape name.
         * Why: output should identify the runtime type.
         * How: returns a constant string.
         */
        @Override
        String name() {
            return "Circle";
        }

        /**
         * Calculates the circle area.
         * Why: this is the runtime-polymorphic behavior.
         * How: applies the circle formula.
         */
        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }

    /**
     * Rectangle provides another overridden area calculation.
     * Why: different subclasses can implement the same contract differently.
     * How: stores width and height and multiplies them.
     */
    static final class Rectangle extends Shape {
        private final double width;
        private final double height;

        /**
         * Creates a rectangle.
         * Why: the object needs width and height to calculate area.
         * How: stores both dimensions in fields.
         */
        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        /**
         * Returns the shape name.
         * Why: output should identify the runtime type.
         * How: returns a constant string.
         */
        @Override
        String name() {
            return "Rectangle";
        }

        /**
         * Calculates the rectangle area.
         * Why: this is the runtime-polymorphic behavior.
         * How: applies the rectangle formula.
         */
        @Override
        double area() {
            return width * height;
        }
    }
}
