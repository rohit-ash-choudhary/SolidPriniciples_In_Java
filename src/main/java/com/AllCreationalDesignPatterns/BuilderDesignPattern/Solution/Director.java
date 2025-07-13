package com.AllCreationalDesignPatterns.BuilderDesignPattern.Solution;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineerStudentBuilder) {
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {
        return studentBuilder
                .setRollno(1)
                .setFirst_name("Rohit")
                .setSubject()
                .build();
    }

    private Student createMBAStudent() {
        return studentBuilder
                .setRollno(2)
                .setFirst_name("Ash")
                .setSubject()
                .build();
    }
}