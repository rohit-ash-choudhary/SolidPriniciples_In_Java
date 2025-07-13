package com.FactoryVsAbstactFac.AbstactFactory.Without;

public class WoodenChair implements Chair{
    @Override
    public void sit() {
        System.out.println("Sitting on Wooden chair");
    }
}
