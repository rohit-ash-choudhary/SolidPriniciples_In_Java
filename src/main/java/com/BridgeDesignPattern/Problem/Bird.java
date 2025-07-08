package com.BridgeDesignPattern.Problem;

import com.BridgeDesignPattern.Solution.Implementor.BreathImplemntor;

/*
this is tightly coupled its need the LivingThing parent class so
to fix this Bridge Design pattern introduce
 */
public class Bird extends LivingThings {


    @Override
    public void breathProcess() {
        System.out.println("Breath using norse");
    }
}

