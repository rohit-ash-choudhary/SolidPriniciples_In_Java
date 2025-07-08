package com.BridgeDesignPattern.Solution.Client;

import com.BridgeDesignPattern.Solution.Abstaction.Dog;
import com.BridgeDesignPattern.Solution.Abstaction.LivingThings;
import com.BridgeDesignPattern.Solution.Implementor.LandLivingThings;

public class MainTest {

    public static void main(String[] args) {
        LivingThings dogobject=new Dog(new LandLivingThings());
        dogobject.breathProcess();
    }
}
