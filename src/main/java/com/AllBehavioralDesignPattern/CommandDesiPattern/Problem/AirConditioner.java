package com.AllBehavioralDesignPattern.CommandDesiPattern.Problem;

public class AirConditioner {

    boolean isOn;
    int Temprature;

    public void turnOnAc(){
        isOn=true;
        System.out.println("Ac is turned On");
    }

    public void turnOffAc(){
        isOn=false;
        System.out.println("Ac is turned off");
    }

    public void SetTemprature(int temp){
       this.Temprature=temp;
        System.out.println("temprature set "+Temprature);
    }
}

