package com.FactoryVsAbstactFac.AbstactFactory.With;

public class TestingClinet {
    public static void main(String[] args) {


        FurnitureFactory ff = new ModernFurnitureFactory();
        Chair chair=(Chair)ff.createChair();
        Table table= (Table) ff.CreateTable();

    }
}
