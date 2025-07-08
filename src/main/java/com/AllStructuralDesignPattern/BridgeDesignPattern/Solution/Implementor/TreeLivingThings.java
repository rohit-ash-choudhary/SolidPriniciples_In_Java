package com.AllStructuralDesignPattern.BridgeDesignPattern.Solution.Implementor;

public class TreeLivingThings implements BreathImplemntor{
    @Override
    public void BreathProcess() {
        System.out.println("Inhale in co2 and exahle o2");
    }
}
