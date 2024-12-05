# SoftWare-Testing
Bank Management System

## Project Overview
The Bank Management System is a Java-based application designed to manage bank accounts. This project demonstrates key Java programming concepts such as object-oriented programming (OOP), exception handling, and the use of collections. Users can create bank accounts, deposit and withdraw money, and view transaction histories.

## Features
- **Account Management:**
    - Create new bank accounts with unique account numbers and account holder names.
    - Display detailed information for each account, including the current balance and transaction history.

- **Deposits and Withdrawals:**
    - Deposit a specified amount of money into an account.
    - Withdraw a specified amount of money from an account if the account has sufficient balance.
    - Record all transactions (deposits and withdrawals) and maintain a history for each account.

- **Transaction History:**
    - View all past transactions for a specific account.

## Project Structure
The project consists of four main classes:
1. `BankAccount`
2. `InsufficientFundsException`
3. `SavingsAccount`
4. `BankManagementSystem`

### 1. BankAccount Class
The `BankAccount` class represents a bank account with fields and methods to manage account details and transactions.

#### Fields
- `String accountNumber`: The unique identifier for the account.
- `String accountHolderName`: The name of the account holder.
- `double balance`: The current balance in the account.
- `List<String> transactions`: A list to store transaction details (both deposits and withdrawals).

#### Constructor
```java
public BankAccount(String accountNumber, String accountHolderName, double balance)
Initializes the bank account with the provided account number, account holder name, and starting balance.

Methods
String getAccountNumber(): Returns the account number.

String getAccountHolderName(): Returns the account holder name.

double getBalance(): Returns the current balance.

List<String> getTransactions(): Returns the list of transactions.

void displayAccountDetails(): Displays the account number, account holder name, and current balance.

void deposit(double amount): Adds the specified amount to the account balance and records the transaction.

void withdraw(double amount) throws InsufficientFundsException: Subtracts the specified amount from the account balance if sufficient funds are available, otherwise throws an InsufficientFundsException.

void displayTransactionHistory(): Prints the transaction history for the account.

2. InsufficientFundsException Class
The InsufficientFundsException is a custom exception used to indicate that a withdrawal request cannot be fulfilled due to insufficient funds in the account.

Constructor
java

public InsufficientFundsException(String message)
Initializes the exception with a custom message indicating the reason for the exception.

3. SavingsAccount Class
The SavingsAccount class extends the BankAccount class and adds functionality specific to savings accounts, such as maintaining a minimum balance requirement.

Additional Field
double minimumBalance: The minimum required balance that must be maintained in the account.

Constructor
java

public SavingsAccount(String accountNumber, String accountHolderName, double balance, double minimumBalance)
Initializes the savings account with the provided details and sets the minimum balance requirement.

Overridden Method
void withdraw(double amount) throws InsufficientFundsException: Ensures that the withdrawal does not reduce the balance below the minimum balance required. If it does, an InsufficientFundsException is thrown.

4. BankManagementSystem Class
The BankManagementSystem class provides a menu-based interface for users to interact with the system. It allows users to create accounts, deposit money, withdraw money, check balances, and view transaction histories.

Main Method
The main method is the entry point of the application. It uses a Scanner object to read user inputs and perform the corresponding actions based on the user's choice from the menu.

Menu Options
Create Account: Prompts the user to enter account details and creates a new BankAccount.

Deposit: Prompts the user to enter the deposit amount and updates the account balance.

Withdraw: Prompts the user to enter the withdrawal amount and updates the account balance if sufficient funds are available.

Check Balance: Displays the current balance of the account.

View Transaction History: Displays the transaction history for the account.

Exit: Exits the application.

How to Run
Clone the repository:

bash
git clone https://github.com/yourusername/BankManagementSystem.git
Navigate to the project directory:

bash
cd BankManagementSystem
Compile the Java files:

bash
javac *.java
Run the application:

bash
java BankManagementSystem
Usage
After running the application, a menu will be displayed with options to create an account, deposit money, withdraw money, check the balance, and view transaction history. Follow the on-screen prompts to perform the desired actions.

Example Interaction
plaintext

1. Create Account
2. Deposit
3. Withdraw
4. Check Balance
5. View Transaction History
6. Exit
Choose an option: 1
Enter account number: 12345
Enter account holder name: John Doe
Account created successfully!

Choose an option: 2
Enter deposit amount: 1000
Amount deposited successfully!

Choose an option: 4
Account Number: 12345
Account Holder Name: John Doe
Balance: 1000.0

Choose an option: 5
Transaction History:
Deposited: 1000.0

Choose an option: 6
Exiting...

