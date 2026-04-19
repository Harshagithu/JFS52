package com.codegnan.oop;

abstract class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    abstract void withdraw(double amount);
}
