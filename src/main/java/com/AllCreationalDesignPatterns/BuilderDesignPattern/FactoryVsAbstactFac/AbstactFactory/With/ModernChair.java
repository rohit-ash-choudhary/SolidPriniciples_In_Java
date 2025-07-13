package com.FactoryVsAbstactFac.AbstactFactory.With;

import com.FactoryVsAbstactFac.AbstactFactory.Without.Chair;

public class ModernChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on Modenr chair");
    }
}
