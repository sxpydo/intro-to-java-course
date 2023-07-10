package com.cbfacademy.accounts;

import java.util.List;

public class Bank {
  private List<Account> accounts;

  public Bank(List<Account> accounts) {
    this.accounts = accounts;
  }

  public void update() {
    for (Account account : accounts) {
      if(account instanceof CurrentAccount){
        var currentAccount = (CurrentAccount)account;
        if(Double.compare(currentAccount.getLimit(), currentAccount.getBalance()) < 0){
          currentAccount.sendLetter();
      }
      if(account instanceof SavingsAccount){
        var savingsAccount = (SavingsAccount)account;
        savingsAccount.addInterest(0);
    }
  }
}
