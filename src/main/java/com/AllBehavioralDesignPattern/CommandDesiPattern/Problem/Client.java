package com.AllBehavioralDesignPattern.CommandDesiPattern.Problem;

public class Client {

    public static void main(String[] args) {
        AirConditioner ac=new AirConditioner();
        ac.turnOnAc();
        ac.SetTemprature(10);
        ac.turnOffAc();

    }
}
