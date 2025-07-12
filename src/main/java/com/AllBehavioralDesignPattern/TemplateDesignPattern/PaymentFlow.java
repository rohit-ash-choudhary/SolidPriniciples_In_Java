package com.AllBehavioralDesignPattern.TemplateDesignPattern;

public abstract class PaymentFlow {

    public abstract void validateRequest();
    public abstract void calcualteFee();
    public abstract void debitAmount();
    public abstract void creditAmount();
    /*
    this fixed prcoess for all the class used as its final this we called template
     */
   public final void sentMoney(){

       validateRequest();
       calcualteFee();
      debitAmount();
       creditAmount();
   }
}
