package com.FactoryVsAbstactFac.Factory.Without;

public class WoodenChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on a plastic chair");
    }
}
