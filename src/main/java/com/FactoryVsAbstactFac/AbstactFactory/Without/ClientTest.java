package com.FactoryVsAbstactFac.AbstactFactory.Without;

public class ClientTest {

    public static void main(String[] args) {

        Table table=new ModernTable();
        Chair chair=new WoodenChair();
    }
}
