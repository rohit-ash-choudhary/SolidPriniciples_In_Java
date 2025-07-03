package com.FactoryVsAbstactFac.Factory.With;

public class ClientTest {
    public static void main(String[] args) {
        Chair chair=ChairFactory.getChair("plastic");
        chair.sit();
    }
}
