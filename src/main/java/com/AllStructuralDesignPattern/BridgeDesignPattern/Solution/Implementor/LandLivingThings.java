package com.AllStructuralDesignPattern.BridgeDesignPattern.Solution.Implementor;

public class LandLivingThings implements BreathImplemntor{
    @Override
    public void BreathProcess() {
        System.out.println("Inhale Oxeygen");
    }
}
