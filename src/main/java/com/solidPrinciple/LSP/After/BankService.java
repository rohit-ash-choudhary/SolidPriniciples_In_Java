package com.solidPrinciple.LSP.After;

public class BankService {
    public void processDeposit(Depositable account, double amount) {
        account.deposit(amount);  // ✅ Safe
    }

    public void processWithdrawal(Withdrawable account, double amount) {
        account.withdraw(amount);  // ✅ Only allowed if it supports withdrawal
    }
}
