/**
 * Shows encapsulation by hiding state behind methods.
 * Why: encapsulation protects object invariants and keeps callers from mutating fields directly.
 * How: a bank account exposes safe operations instead of public fields.
 */
public final class EncapsulationDemo {

    /**
     * Runs the encapsulation example from the command line.
     * Why: this makes the topic runnable on its own.
     * How: delegates to {@link #run()} so the same logic can be reused by the master app.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Executes the encapsulation example.
     * Why: controlled access prevents invalid state.
     * How: deposits and withdrawals are validated inside the class.
     */
    public static void run() {
        BankAccount account = new BankAccount("Asha", 100);

        System.out.println("Owner: " + account.getOwner());
        System.out.println("Opening balance: " + account.getBalance());

        account.deposit(50);
        System.out.println("After deposit: " + account.getBalance());

        boolean withdrew = account.withdraw(120);
        System.out.println("Withdraw 120 succeeded? " + withdrew);
        System.out.println("Balance after failed withdraw: " + account.getBalance());

        withdrew = account.withdraw(80);
        System.out.println("Withdraw 80 succeeded? " + withdrew);
        System.out.println("Final balance: " + account.getBalance());
        System.out.println("Fields stay private, so all changes go through the class rules.");
    }

    /**
     * Represents a bank account with private state.
     * Why: callers should not be able to set balance directly.
     * How: methods enforce valid deposits and withdrawals.
     */
    static final class BankAccount {
        private final String owner;
        private int balance;

        /**
         * Creates an account with an owner and opening balance.
         * Why: the object starts in a valid state.
         * How: stores the constructor arguments in private fields.
         */
        BankAccount(String owner, int openingBalance) {
            this.owner = owner;
            this.balance = openingBalance;
        }

        /**
         * Returns the account owner.
         * Why: read access is safe when the field cannot be mutated externally.
         * How: exposes the private value as a string.
         */
        String getOwner() {
            return owner;
        }

        /**
         * Returns the current balance.
         * Why: callers can inspect state without being able to bypass business rules.
         * How: returns the private balance field.
         */
        int getBalance() {
            return balance;
        }

        /**
         * Adds money to the account.
         * Why: deposits should never reduce balance.
         * How: rejects non-positive amounts and updates the private field.
         */
        void deposit(int amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit must be positive");
            }
            balance += amount;
        }

        /**
         * Tries to remove money from the account.
         * Why: withdrawals must not overdraw the account.
         * How: returns false when the request is invalid instead of exposing the field.
         */
        boolean withdraw(int amount) {
            if (amount <= 0 || amount > balance) {
                return false;
            }
            balance -= amount;
            return true;
        }
    }
}
