package com.AllStructuralDesignPattern.FlyWeightDesignPattern.Solution;

public class ClientTestingMail {

    public static void main(String[] args) {
        Robot humanoidRobot1=RoboticFactory.createRobot("HUMANOID");
        humanoidRobot1.display(1,2);


        Robot humanoidRobot2=RoboticFactory.createRobot("HUMANOID");
        humanoidRobot2.display(3,2);

        Robot machhineRobot1=RoboticFactory.createRobot("MACHINOID");
        machhineRobot1.display(1,1);
    }
}
