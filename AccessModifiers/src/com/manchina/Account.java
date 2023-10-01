package com.manchina;

import java.util.ArrayList;

public class Account{
    public String accountName;
    public int balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " has been deposited. Current balance is " + this.balance);
        }else{
            System.out.println("Negative sums cannot be deposited.");
        }
    }

    public void withdraw(int amount){
        int withdrawal = -amount;
        if(withdrawal < 0){
            this.transactions.add(amount);
            this.balance += withdrawal;
            System.out.println(amount + " has been withdrawn. Current balance is " + balance);
        }else{
            System.out.println("Negative sums cannot be withdrawn.");
        }
    }

    public void calculateBalance(){
        for(int i : transactions){
            this.balance += i;
        }
    }
}
