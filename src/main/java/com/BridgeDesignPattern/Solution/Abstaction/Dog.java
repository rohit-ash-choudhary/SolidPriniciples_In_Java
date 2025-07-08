package com.BridgeDesignPattern.Solution.Abstaction;

import com.BridgeDesignPattern.Solution.Implementor.BreathImplemntor;

public class Dog extends LivingThings{

    public Dog(BreathImplemntor breathimplemntor) {
        super(breathimplemntor);
    }

   public void breathProcess(){
        breathimplemntor.BreathProcess();
    }
}
