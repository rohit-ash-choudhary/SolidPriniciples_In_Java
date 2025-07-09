package com.AllStructuralDesignPattern.FlyWeightDesignPattern.Solution;

import com.AllStructuralDesignPattern.FlyWeightDesignPattern.Solution.Sprintes;
//this is mutable class
public class HumaniodRobot implements Robot{

    private String type;
    private Sprintes body;

    public HumaniodRobot(String type, Sprintes body) {
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
        System.out.println("create humoid robo at "+x + " "+y);
    }



}
