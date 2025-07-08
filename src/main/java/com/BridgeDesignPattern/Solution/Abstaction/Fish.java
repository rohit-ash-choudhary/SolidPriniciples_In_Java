package com.BridgeDesignPattern.Solution.Abstaction;

import com.BridgeDesignPattern.Solution.Implementor.BreathImplemntor;

public class Fish extends LivingThings{

    public Fish(BreathImplemntor breathimplemntor) {
        super(breathimplemntor);
    }

    public void breathProcess(){
        breathimplemntor.BreathProcess();
    }
}