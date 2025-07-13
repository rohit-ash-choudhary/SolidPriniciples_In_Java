package com.FactoryVsAbstactFac.AbstactFactory.Without;

public class WoodenTable implements Table {
    @Override
    public void use() {
        System.out.println("Using wooden table");
    }
}
