import InsufficientFundsException.InsufficientFundsException;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private final List<String> transactions;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    // Getter and Setter Methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    // Method to create an account
    public void createAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0; // Initial balance
        this.transactions.clear(); // Start with an empty transaction list
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > 0 && amount <= balance) {
            balance = amount;
            transactions.add("Withdrew: $" + amount);
        } else if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to view transaction history
    public void viewTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions to display.");
        } else {
            System.out.println("Transaction History:");
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > 0 && amount <= balance) {
            balance = amount;
            transactions.add("Withdrawn: " + amount);
            System.out.println("Amount withdrawn: " + amount);
        } else {
            throw new InsufficientFundsException("Insufficient funds for withdrawal. Available balance: " + balance);
        }
    }

}
