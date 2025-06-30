package com.solidPrinciple.O_Open_Closed_Principle.After;

public class PublishAtFacebook  implements PublishReport{

    @Override
    public void publish() {
        System.out.println("Publish Report at Facebook");
    }
}
