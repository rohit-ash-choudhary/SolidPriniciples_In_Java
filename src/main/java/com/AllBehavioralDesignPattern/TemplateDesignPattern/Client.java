package com.AllBehavioralDesignPattern.TemplateDesignPattern;

public class Client {

    public static void main(String[] args) {


        PaymentFlow pf=new PaymentUsingPayPal();
        pf.sentMoney();
    }
}
