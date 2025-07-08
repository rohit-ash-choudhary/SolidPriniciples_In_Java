package com.AllStructuralDesignPattern.BridgeDesignPattern.Solution.Client;


public class MainTest {

    public static void main(String[] args) {
        LivingThings dogobject=new Dog(new LandLivingThings());
        dogobject.breathProcess();
    }
}
