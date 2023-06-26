package com.cbfacademy.accounts;

public class SavingsAcount extends Account {

    private double interest;

    public SavingsAcount(double balance, int accountNumber, double interest) {
        super(balance, accountNumber);
        this.interest = interest;

    }

    public void addInterest(int years){
        super.balance += (years * interest);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Minimum balance of £100 required!");
        } else {
            super.withdraw(amount);
        }
    }
    
}
