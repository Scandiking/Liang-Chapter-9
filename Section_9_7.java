/*

(The Account class) Design a class named Account that contains:
- A private int data field named id for the account (default 0)
- A private double field named balance for the account (default 0)
- A private double data field named annualInterestRate that stores the current interest rate (default 0). Assume that all accounts have the same interest rate.
- A private Date data field named dateCreated that stores the date when the account was created.
- A no-arg constructor that creates a default class
- A constructor that creates an account with the specified id and initial balance.
- The accessor and mutator methods for id, balance, and annualInterestRate
- The accessor method for dateCreated
- A method named getMonthlyInterestRate() that returns the monthly interest rate
- A ,ethod named getMonthlyInterest() that returns the monthly interest
- A method named withdraw that withdraws a specified amount from the account
- A method named deposit that deposits a specified amount to the account

Draw the UML diagram for the class then implement the class. (Hint: The method getMonthlyInterest() is to
return monthly interest, not the interest rate. Monthly interest is balance * monthlyInterestRate.monthlyInterestRate is
annualInterestRate / 12. Note annualInterestRate is a percentage, for example 4.5%. You need to divide it by 100.)
Write a test program that creates an Account object with an account ID of 1122, a balance of $20.000 and an annual
interest rate of 4.5%. Use the withdraw method to withdraw $2.500, use the deposit method to deposit $3.000, and print
the balance, the monthly interest, and the date when this account was created.

*/

// Import data package
import java.util.Date;

// Normally class would be called "Account"
public class Section_9_7 {
    // Private fields
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // Normally would be called "Account"
    // No-arg constructor
    public Section_9_7() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Constructor with specified id and balance
    public Section_9_7(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Accessor and mutator methods
    // to get id
    public int getID() {
        return id;
    }

    // to setID
    public void setID(int id) {
        this.id = id;
    }

    // to get balance
    public double getBalance() {
        return balance;
    }

    // to set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // to get annual interest rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // to set annual interest rate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // to get date created
    public Date getDateCreated() {
        return dateCreated;
    }

    // Method to get monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    // Method to get the monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // Method to withdraw a specified amount
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    // Method to deposit a specified amount
    public void deposit(double amount) {
        balance += amount;
    }


}
