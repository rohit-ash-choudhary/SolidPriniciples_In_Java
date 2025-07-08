package com.BridgeDesignPattern.Solution.Abstaction;

import com.BridgeDesignPattern.Solution.Implementor.BreathImplemntor;

public class Tree extends LivingThings{

    public Tree(BreathImplemntor breathimplemntor) {
        super(breathimplemntor);
    }

    public void breathProcess(){
        breathimplemntor.BreathProcess();
    }
}