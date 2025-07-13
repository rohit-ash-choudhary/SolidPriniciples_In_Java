package com.FactoryVsAbstactFac.AbstactFactory.With;

import com.FactoryVsAbstactFac.AbstactFactory.Without.Chair;
import com.FactoryVsAbstactFac.AbstactFactory.Without.ModernChair;
import com.FactoryVsAbstactFac.AbstactFactory.Without.ModernTable;
import com.FactoryVsAbstactFac.AbstactFactory.Without.Table;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table CreateTable() {
        return new ModernTable();
    }
}
