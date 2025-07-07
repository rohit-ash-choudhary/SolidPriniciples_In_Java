package com.AdapterDesignPattern.Adapter;

import com.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeighMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightmachine;

    public WeighMachineAdapterImpl(WeightMachine weightmachine)
    {
        this.weightmachine=weightmachine;
    }




    /*
    ✅ Why constructor is needed?
In your class:


WeightMachine weightmachine; // This is just a reference (null by default)
So, if you try to call:



double weighinpounds = weightmachine.getWeightInPounds();
without initializing weightmachine, it will throw a:


NullPointerException
✅ Constructor use ensures initialization
The constructor is used to pass the WeightMachine object (like WeightMachineImpl) from outside:


public WeighMachineAdapterImpl(WeightMachine weightmachine) {
    this.weightmachine = weightmachine; // Now it's initialized
}
     */


    @Override
    public double getWeightInKg() {
        double weighinpounds=weightmachine.getWeightInPounds();
        double weightinkg=weighinpounds* .45;
        return weightinkg;
    }
}
