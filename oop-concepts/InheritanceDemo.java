/**
 * Shows inheritance by reusing behavior from a parent class.
 * Why: inheritance lets a child type specialize shared behavior from a base type.
 * How: a dog inherits common animal state and behavior, then adds its own sound.
 */
public final class InheritanceDemo {

    /**
     * Runs the inheritance example from the command line.
     * Why: this makes the topic runnable on its own.
     * How: delegates to {@link #run()} so the same logic can be reused by the master app.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the inheritance example.
     * Why: a subclass can reuse and extend parent behavior.
     * How: creates a dog and calls inherited and overridden methods.
     */
    public static void run() {
        Dog dog = new Dog("Milo");
        System.out.println(dog.describe());
        dog.eat();
        dog.sleep();
        dog.sound();
        System.out.println("Dog is-a Animal, so it inherits shared behavior and adds its own.");
    }

    /**
     * Base animal type with shared behavior.
     * Why: common state belongs in one place.
     * How: child classes reuse the name field and the eat/sleep methods.
     */
    static class Animal {
        private final String name;

        /**
         * Creates an animal with a name.
         * Why: all animal instances need an identity for the demo output.
         * How: stores the name in a private field.
         */
        Animal(String name) {
            this.name = name;
        }

        /**
         * Returns a description of the animal.
         * Why: the child class inherits this method without rewriting it.
         * How: formats the shared state.
         */
        String describe() {
            return "Animal{name='" + name + "'}";
        }

        /**
         * Shows a behavior shared by all animals.
         * Why: parent behavior is automatically available to the child.
         * How: prints a simple message.
         */
        void eat() {
            System.out.println(name + " is eating.");
        }

        /**
         * Shows another shared behavior.
         * Why: inherited methods reduce duplication.
         * How: prints a simple message.
         */
        void sleep() {
            System.out.println(name + " is sleeping.");
        }
    }

    /**
     * Dog specializes the Animal type.
     * Why: a child class can reuse the parent and customize behavior.
     * How: it adds a dog-specific sound method.
     */
    static final class Dog extends Animal {
        /**
         * Creates a dog with a name.
         * Why: the parent constructor should initialize shared state.
         * How: passes the name up with super(...).
         */
        Dog(String name) {
            super(name);
        }

        /**
         * Dog-specific behavior.
         * Why: inheritance is useful when the child adds new behavior.
         * How: prints a dog sound message.
         */
        void sound() {
            System.out.println("Woof!");
        }
    }
}
