package com.BuilderDesignPattern.Solution;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubject() {
        this.subject = "Management";
        return this;
    }
}
