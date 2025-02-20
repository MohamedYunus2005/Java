import java.util.ArrayList;
import java.util.Scanner;

class Transaction {
    String type;
    double amount;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String toString() {
        return type + ": " + amount;
    }
}

class User {
    String userId;
    String userPin;
    double balance;
    ArrayList<Transaction> transactionHistory;

    User(String userId, String userPin, double balance) {
        this.userId = userId;
        this.userPin = userPin;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    boolean authenticate(String userId, String userPin) {
        return this.userId.equals(userId) && this.userPin.equals(userPin);
    }

    void addTransaction(String type, double amount) {
        transactionHistory.add(new Transaction(type, amount));
    }

    void displayTransactionHistory() {
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            addTransaction("Withdraw", amount);
            System.out.println("Withdraw successful! New balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    void deposit(double amount) {
        balance += amount;
        addTransaction("Deposit", amount);
        System.out.println("Deposit successful! New balance: " + balance);
    }

    void transfer(User recipient, double amount) {
        if (amount <= balance) {
            balance -= amount;
            recipient.balance += amount;
            addTransaction("Transfer to " + recipient.userId, amount);
            recipient.addTransaction("Transfer from " + this.userId, amount);
            System.out.println("Transfer successful! New balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class Bank {
    ArrayList<User> users;

    Bank() {
        users = new ArrayList<>();
        users.add(new User("user123", "pin123", 1000));
        users.add(new User("user456", "pin456", 500));
    }

    User findUser(String userId, String userPin) {
        for (User user : users) {
            if (user.authenticate(userId, userPin)) {
                return user;
            }
        }
        return null;
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.print("Enter user id: ");
        String userId = scanner.nextLine();
        System.out.print("Enter user pin: ");
        String userPin = scanner.nextLine();

        User currentUser = bank.findUser(userId, userPin);

        if (currentUser != null) {
            while (true) {
                System.out.println("\nATM Menu:");
                System.out.println("1. Transaction History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        currentUser.displayTransactionHistory();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        currentUser.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        currentUser.deposit(depositAmount);
                        break;
                    case 4:
                        System.out.print("Enter recipient user id: ");
                        String recipientUserId = scanner.next();
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = scanner.nextDouble();
                        User recipient = bank.findUser(recipientUserId, userPin);  // assuming same PIN for simplicity
                        if (recipient != null) {
                            currentUser.transfer(recipient, transferAmount);
                        } else {
                            System.out.println("Recipient user not found!");
                        }
                        break;
                    case 5:
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Authentication failed!");
        }

        scanner.close();
    }
}



