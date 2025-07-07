package com.BuilderDesignPattern.Solution;

public class EngineerStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubject() {
        this.subject = "CSE";
        return this;
    }
}
