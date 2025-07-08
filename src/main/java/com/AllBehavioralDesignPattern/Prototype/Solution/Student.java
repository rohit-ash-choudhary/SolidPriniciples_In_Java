package com.AllBehavioralDesignPattern.Prototype.Solution;

public class Student implements Prototype {

     String name;
     String course;
     private int roll;

    public Student(String name, String course, int roll) {
        this.name=name;
        this.roll=roll;
        this.course=course;
    }


    @Override
    public Prototype clone() {
        return new Student(name,course,roll);
    }
}
