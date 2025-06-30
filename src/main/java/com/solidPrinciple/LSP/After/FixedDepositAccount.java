package com.solidPrinciple.LSP.After;

public class FixedDepositAccount implements Depositable{
    @Override
    public void deposit(double amount) {
        System.out.println("FD deposit: " + amount);
    }
}
