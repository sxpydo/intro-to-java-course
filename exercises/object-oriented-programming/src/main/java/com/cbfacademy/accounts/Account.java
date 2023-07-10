package com.cbfacademy.accounts;

public class Account {
    private int accountNumber;
    public double balance;

    public Account(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
       this.balance -= amount;
    }

    public int getAccountNumber() {
       return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }
    
}
