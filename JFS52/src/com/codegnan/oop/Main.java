package com.codegnan.oop;

public class Main {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("S1", 5000);
        sa.withdraw(3000); 
        sa.withdraw(2000);  

        CurrentAccount ca = new CurrentAccount("C1", 2000);
        ca.withdraw(6000);  
        ca.withdraw(2000);  
    }
}
