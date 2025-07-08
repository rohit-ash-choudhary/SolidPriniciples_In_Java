package com.AllStructuralDesignPattern.AdapterDesignPattern.Client;

import com.AllStructuralDesignPattern.AdapterDesignPattern.Adaptee.BabyWeightMachine;
import com.AllStructuralDesignPattern.AdapterDesignPattern.Adapter.WeighMachineAdapterImpl;
import com.AllStructuralDesignPattern.AdapterDesignPattern.Adapter.WeightMachineAdapter;

public class CleintTest {

    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeighMachineAdapterImpl(new BabyWeightMachine());
        System.out.println(weightMachineAdapter.getWeightInKg());

    }
}
