package Oops.Encapsulation;

public class BankAccount {

    // Private instance variables (hidden from outside the class)
    private double balance;
    private String ownerName;

    // Public constructor with initial balance and owner name
    public BankAccount(double initialBalance, String name) {
        this.balance = initialBalance;
        this.ownerName = name;
    }

    // Public methods to access and modify account information
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Getter for owner name (optional, could be private too)
    public String getOwnerName() {
        return ownerName;
    }
}
