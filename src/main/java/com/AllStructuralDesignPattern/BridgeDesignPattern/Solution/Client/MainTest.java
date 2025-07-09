package com.AllStructuralDesignPattern.BridgeDesignPattern.Solution.Client;


import com.AllStructuralDesignPattern.BridgeDesignPattern.Solution.Abstaction.Dog;
import com.AllStructuralDesignPattern.BridgeDesignPattern.Solution.Abstaction.LivingThings;
import com.AllStructuralDesignPattern.BridgeDesignPattern.Solution.Implementor.LandLivingThings;

public class MainTest {

    public static void main(String[] args) {
        LivingThings dogobject=new Dog(new LandLivingThings());
        dogobject.breathProcess();
    }
}
