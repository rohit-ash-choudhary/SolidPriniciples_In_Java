package com.AllCreationalDesignPatterns.BuilderDesignPattern.Solution;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubject() {
        this.subject = "Management";
        return this;
    }
}
