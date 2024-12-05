import InsufficientFundsException.InsufficientFundsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount currentAccount = null;
        boolean running = true;

        while (running) {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. View Transaction History");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accountNumber = scanner.next();
                    System.out.print("Enter Account Holder Name: ");
                    String holderName = scanner.next();
                    currentAccount = new BankAccount(accountNumber, holderName);
                    System.out.println("Account created successfully!");
                    break;
                case 2:
                    if (currentAccount != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        currentAccount.deposit(depositAmount);
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("No account found.");
                    }
                    break;
                case 3:
                    if (currentAccount != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        try {
                            currentAccount.withdraw(withdrawAmount);
                            System.out.println("Withdrawal successful!");
                        } catch (InsufficientFundsException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("No account found.");
                    }
                    break;
                case 4:
                    if (currentAccount != null) {
                        currentAccount.checkBalance();
                    } else {
                        System.out.println("No account found.");
                    }
                    break;
                case 5:
                    if (currentAccount != null) {
                        currentAccount.viewTransactionHistory();
                    } else {
                        System.out.println("No account found.");
                    }
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }

        scanner.close();
    }
}