package com.BridgeDesignPattern.Problem;

import com.BridgeDesignPattern.Solution.Implementor.BreathImplemntor;

public class Dog extends LivingThings {


    @Override
    public void breathProcess() {

        System.out.println("Breath using inhale or exhale");
    }
}
