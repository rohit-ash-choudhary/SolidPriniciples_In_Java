package com.AllBehavioralDesignPattern.TemplateDesignPattern;

public class PayUsingUPI extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate request for UPI");
    }
    @Override
    public void calcualteFee() {
        System.out.println("calculate fee for UPI");
    }
    @Override
    public void debitAmount() {
        System.out.println("Debit amout  for UPI");
    }
    @Override
    public void creditAmount() {

        System.out.println("Credit amount fee for UPI");

    }
}
