package com.cbfacademy.accounts;

public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(double balance, int accountNumber) {
        super(balance, accountNumber);
    
    }

    public double getLimit() {
        return this.overdraftLimit;
    }

    public void setLimit(double limit) { 
        this.overdraftLimit=limit; 
    }

    public String sendLetter(){
        return "Letter has been sent to your address!";
    }


    public void withdraw (double limit) { 
        if (limit <= this.balance)
            super.withdraw(limit);
        else { 
            System.out.println(" Sorry, Limit Exceeded" );
        }

    }


    public String toString() { 
        return super.toString() +"Limit : "+balance; 
    }
    
}
