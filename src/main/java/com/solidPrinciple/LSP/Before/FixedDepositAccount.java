package com.solidPrinciple.LSP.Before;

public class FixedDepositAccount extends Account {
    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawal not allowed on Fixed Deposit");
    }
}
