package com.solidPrinciple.LSP.After;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        Depositable fd = new FixedDepositAccount();
        bankService.processDeposit(fd, 5000);  // ✅ OK

        Withdrawable savings = new SavingsAccount();
        bankService.processWithdrawal(savings, 1000);  // ✅ OK

        // bankService.processWithdrawal(fd, 1000);  // ❌ Compile-time error — LSP SAFE!
    }
}
