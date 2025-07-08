package com.AllBehavioralDesignPattern.Prototype.Solution;

public class Main {

    public static void main(String[] args) {
        Student original_object = new Student("ashhh", "CSE", 454);

        Student cloneobject =(Student) original_object.clone();
    }
}
