package com.codegnan.oop;

class CurrentAccount extends BankAccount {

    CurrentAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    void withdraw(double amount) {
        if (balance - amount >= -5000) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}