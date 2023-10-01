package com.manchina;

public class Main {
    public static void main(String[] args) {
        Account premsAccount = new Account("prem");
        premsAccount.deposit(1000);
        premsAccount.withdraw(500);
        premsAccount.withdraw(-200);
        premsAccount.deposit(-100);

        System.out.println("Balance on account is " + premsAccount.getBalance());
    }
}