package com.AllStructuralDesignPattern.BridgeDesignPattern.Solution.Abstaction;

import com.AllStructuralDesignPattern.BridgeDesignPattern.Solution.Implementor.BreathImplemntor;

public abstract class LivingThings {

    BreathImplemntor breathimplemntor;

    public LivingThings(BreathImplemntor breathimplemntor)
    {
        this.breathimplemntor=breathimplemntor;
    }

    public abstract  void breathProcess();
}
