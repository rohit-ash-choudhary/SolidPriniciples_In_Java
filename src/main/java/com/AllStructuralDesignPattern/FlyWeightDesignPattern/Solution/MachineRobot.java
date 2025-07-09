package com.AllStructuralDesignPattern.FlyWeightDesignPattern.Solution;

public class MachineRobot implements Robot {

    private String type;
    private Sprintes body;

    public MachineRobot(String type, Sprintes body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprintes getBody() {
        return body;
    }
    @Override
    public void display(int x, int y) {
        System.out.println("create machine object robo at "+x + " "+y);
    }
}
