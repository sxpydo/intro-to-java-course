package com.cbfacademy.accounts;

public class Bank {
      public static void main(String[] args) {
        Account[] accounts = new Account[2];
        accounts[0] = new SavingsAccount(2, 0, 0.25);
        accounts[1] = new CurrentAccount(23, 50);

        for(int i=0; i<accounts.length;i++) {
            Object SavingsAccount;
            if (accounts[0].equals(SavingsAccount)
                System.out.println(accounts[0].getInterest());
        }
    
}
