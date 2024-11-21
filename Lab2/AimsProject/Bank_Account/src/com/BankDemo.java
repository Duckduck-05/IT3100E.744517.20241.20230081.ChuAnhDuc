package com;

class BankAccount {
    private String name;
    private String accnum;
    private double balance;
    private static final double MIN_BALANCE = 50000;
    private static final double WITHDRAW_FEE = 5000;

    public BankAccount(String name, String accnum, double balance) {
        this.name = name;
        this.accnum = accnum;
        this.balance = Math.max(balance, MIN_BALANCE);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposited: " + amount);
        } else {
            System.out.println("deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount - WITHDRAW_FEE) >= MIN_BALANCE) {
            balance -= (amount + WITHDRAW_FEE);
            System.out.println("withdrew: " + amount + " with fee: " + WITHDRAW_FEE);
        } else {
            System.out.println("not enough money to withdraw");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingAccount extends BankAccount {
    private double interestrate;

    public SavingAccount(String name, String accnum, double balance, double interestrate) {
        super(name, accnum, balance);
        this.interestrate = interestrate;
    }

    public double calculateMonthlyInterest() {
        return (getBalance() * (interestrate / 100)) / 12;
    }

    public void withdrawFromSaving(double amount) {
        System.out.println("withdrawal not allowed from a saving account.");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount normalAcc = new BankAccount("Quan", "1234", 60000);
        normalAcc.deposit(10000);
        normalAcc.withdraw(20000);
        System.out.println("Normal Account Balance: " + normalAcc.getBalance());

        SavingAccount savingAcc = new SavingAccount("Nguyen The", "686868", 100000, 5);
        savingAcc.deposit(5000);
        System.out.println("Saving Account Balance: " + savingAcc.getBalance());
        System.out.println("Monthly Interest: " + savingAcc.calculateMonthlyInterest());
        savingAcc.withdrawFromSaving(10000); 
    }
}
