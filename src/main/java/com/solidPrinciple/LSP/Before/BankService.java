package com.solidPrinciple.LSP.Before;

public class BankService {
    public void processWithdrawal(Account account, double amount) {
        account.withdraw(amount);  // ❌ This can crash if it's a FixedDepositAccount
    }
}
