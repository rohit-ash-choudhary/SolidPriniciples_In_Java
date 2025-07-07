package com.AdapterDesignPattern.Adaptee;

public class BabyWeightMachine implements  WeightMachine{
    @Override
    public double getWeightInPounds() {
        return 80;
    }
}
