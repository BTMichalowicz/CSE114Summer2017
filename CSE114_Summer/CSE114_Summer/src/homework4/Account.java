package homework4;






//Benjamin Michalowicz (SBU ID: 110982339)
//Homework 4, Part 2: Account, Checking Account, and Savings Account Classes (Superlass and Subclasses all in one file)

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

    public Date getDateCreated() {
        return dateCreated;
    }

    private Date dateCreated;

    public Account() {
        this(0, 0, 0);
        this.dateCreated = new Date();
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("There are not enough funds in the account. No withdrawing will be done.\n");
        } else {
            this.setBalance(balance - amount);
        }
    }

    public void deposit(double amount) {
        
        if(amount>0) {
            this.setBalance(balance + amount);
        }
    }

    @Override
    public String toString() {
        return "Account ID: " + this.id
                + "\nBalance: $" + this.balance
                + "\nMonthly Interest: " + getMonthlyInterestRate() + "%"
                + "\nDate Created: " + getDateCreated() + "\n";
    }

    

}

class SavingsAccount extends Account {
    
    private int id;
    private double balance, annualInterestRate;

    public SavingsAccount() {
        this(0, 0.0, 0.0);
    }

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public String toString() {
        return "Savings Account:\n" + super.toString() + "\n";
    }

}

//CheckingAccount class
class CheckingAccount extends Account {

    private double overdraftLimit = 75.00; //Overdraft limit for all accountss

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public CheckingAccount() {
        this(0, 0.0, 0.0);

    }

    @Override
    public void withdraw(double amount) {
        if (amount>=(this.getBalance()+overdraftLimit)) {
            System.out.println("Insufficient funds. No withdrawing will be done.\n");

        } else {
            super.setBalance(super.getBalance() - amount);
        }
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    public CheckingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
        

    }

    @Override
    public String toString() {
        return "Checking Account: \n" + super.toString() + "\nOverdraft Limit: $" + this.getOverdraftLimit() + "\n";
    }

}
