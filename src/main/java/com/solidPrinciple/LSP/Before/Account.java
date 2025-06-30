package com.solidPrinciple.LSP.Before;

public class Account {
    public void deposit(double amount) {
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        System.out.println("Withdrew: " + amount);
    }
}
