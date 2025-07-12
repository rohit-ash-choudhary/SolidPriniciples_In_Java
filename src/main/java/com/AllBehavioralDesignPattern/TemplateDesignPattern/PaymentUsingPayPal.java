package com.AllBehavioralDesignPattern.TemplateDesignPattern;

public class PaymentUsingPayPal extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate request for PayPayl");
    }
    @Override
    public void calcualteFee() {
        System.out.println("calculate fee for PayPayl");
    }
    @Override
    public void debitAmount() {
        System.out.println("Debit amout  for PayPayl");
    }
    @Override
    public void creditAmount() {

        System.out.println("Credit amount fee for PayPayl");

    }
}
