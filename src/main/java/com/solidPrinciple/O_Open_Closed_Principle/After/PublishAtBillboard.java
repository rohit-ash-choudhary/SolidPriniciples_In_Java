package com.solidPrinciple.O_Open_Closed_Principle.After;

public class PublishAtBillboard implements PublishReport{
    @Override
    public void publish() {
        System.out.println("Publish Report at BillBoard");
    }
}
