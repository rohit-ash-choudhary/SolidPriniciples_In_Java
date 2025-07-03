package com.FactoryVsAbstactFac.AbstactFactory.With;

import com.FactoryVsAbstactFac.AbstactFactory.Without.Chair;
import com.FactoryVsAbstactFac.AbstactFactory.Without.Table;
import com.FactoryVsAbstactFac.AbstactFactory.Without.WoodenChair;
import com.FactoryVsAbstactFac.AbstactFactory.Without.WoodenTable;

public class VictorianFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new WoodenChair();
    }

    @Override
    public Table CreateTable() {
        return new WoodenTable();
    }
}
