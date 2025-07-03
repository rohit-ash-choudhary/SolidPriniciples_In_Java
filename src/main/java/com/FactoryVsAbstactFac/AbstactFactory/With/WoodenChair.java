package com.FactoryVsAbstactFac.AbstactFactory.With;

import com.FactoryVsAbstactFac.AbstactFactory.Without.Chair;

public class WoodenChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on Wooden chair");
    }
}
