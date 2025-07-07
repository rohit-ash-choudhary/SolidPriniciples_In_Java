package com.AdapterDesignPattern.Client;

import com.AdapterDesignPattern.Adaptee.BabyWeightMachine;
import com.AdapterDesignPattern.Adaptee.WeightMachine;
import com.AdapterDesignPattern.Adapter.WeighMachineAdapterImpl;
import com.AdapterDesignPattern.Adapter.WeightMachineAdapter;

public class CleintTest {

    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeighMachineAdapterImpl(new BabyWeightMachine());
        System.out.println(weightMachineAdapter.getWeightInKg());

    }
}
