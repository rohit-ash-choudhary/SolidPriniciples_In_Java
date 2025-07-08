package com.AllBehavioralDesignPattern.Prototype.Problem;

public class Main {

    public static void main(String[] args) {
        Student original_object=new Student("ashhh","CSE",454);

        Student cloneobject=new Student();
        cloneobject.name= original_object.name;
        cloneobject.course=original_object.course;
      //  cloneobject.roll=original_object.roll;
        //this is the one of problem we can't clone private variable in clone
    }
}
