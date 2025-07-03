package com.FactoryVsAbstactFac.Factory.Without;

public class PlasticChair implements Chair {

    @Override
    public void sit() {
        System.out.println("Sit on plastic chair");
    }
}
