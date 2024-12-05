import InsufficientFundsException.InsufficientFundsException;

public class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 100.0; // Minimum balance required

    public SavingsAccount(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    // Override withdraw method to enforce minimum balance
    @Override
    public void withdraw(double amount) throws InsufficientFundsException, InsufficientFundsException {
        if (getBalance() - amount < MIN_BALANCE) {
            throw new InsufficientFundsException("Cannot withdraw. Minimum balance must be maintained.");
        }
        super.withdraw(amount);
    }

    // Additional feature: calculate interest
    public void applyInterest(double rate) {
        double interest = getBalance() * rate / 100;
        deposit(interest);
        System.out.println("Interest applied: $" + interest);
    }
}
