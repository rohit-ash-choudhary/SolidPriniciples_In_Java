package com.solidPrinciple.Interface_Segregation_Principle.After;

public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Working");
    }
}
