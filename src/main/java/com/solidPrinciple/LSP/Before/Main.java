package com.solidPrinciple.LSP.Before;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        Account fd = new FixedDepositAccount();
        bankService.processWithdrawal(fd, 1000);  // 💥 BOOM! Throws runtime exception
    }
}
