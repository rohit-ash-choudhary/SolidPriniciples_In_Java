package com.solidPrinciple.O_Open_Closed_Principle.After;

public class PublishAtInstagram implements PublishReport{

    @Override
    public void publish() {
        System.out.println("Publish Report at Instgram");
    }
}
