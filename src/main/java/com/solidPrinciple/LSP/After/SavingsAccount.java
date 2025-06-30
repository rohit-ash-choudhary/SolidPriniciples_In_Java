package com.solidPrinciple.LSP.After;

public class SavingsAccount implements Depositable,Withdrawable{
    @Override
    public void deposit(double amount) {
        System.out.println("Savings deposit: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Savings withdrawal: " + amount);
    }
}
