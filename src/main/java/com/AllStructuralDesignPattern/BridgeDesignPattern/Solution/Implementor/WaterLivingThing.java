package com.AllStructuralDesignPattern.BridgeDesignPattern.Solution.Implementor;

public class WaterLivingThing implements BreathImplemntor{
    @Override
    public void BreathProcess() {
        System.out.println("inhale oxyegn from water");
    }
}
