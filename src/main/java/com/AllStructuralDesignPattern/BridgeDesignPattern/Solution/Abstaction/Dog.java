package com.AllStructuralDesignPattern.BridgeDesignPattern.Solution.Abstaction;

import com.AllStructuralDesignPattern.BridgeDesignPattern.Solution.Implementor.BreathImplemntor;

public class Dog extends LivingThings{

    public Dog(BreathImplemntor breathimplemntor) {
        super(breathimplemntor);
    }

   public void breathProcess(){
        breathimplemntor.BreathProcess();
    }
}
