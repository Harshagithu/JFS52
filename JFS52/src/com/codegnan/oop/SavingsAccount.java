package com.codegnan.oop;

class SavingsAccount extends BankAccount {

    SavingsAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Minimum balance must be 1000");
        }
    }
}