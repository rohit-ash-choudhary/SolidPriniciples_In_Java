package com.FactoryVsAbstactFac.AbstactFactory.With;

import com.FactoryVsAbstactFac.AbstactFactory.Without.Chair;
import com.FactoryVsAbstactFac.AbstactFactory.Without.Table;

public interface FurnitureFactory {

    Chair createChair();
    Table CreateTable();
}
