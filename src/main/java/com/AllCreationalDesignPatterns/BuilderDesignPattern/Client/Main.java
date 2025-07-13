package com.AllCreationalDesignPatterns.BuilderDesignPattern.Client;


import com.AllCreationalDesignPatterns.BuilderDesignPattern.Solution.Director;
import com.AllCreationalDesignPatterns.BuilderDesignPattern.Solution.EngineerStudentBuilder;
import com.AllCreationalDesignPatterns.BuilderDesignPattern.Solution.MBAStudentBuilder;
import com.AllCreationalDesignPatterns.BuilderDesignPattern.Solution.Student;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director(new EngineerStudentBuilder());
        Student engineeringStudent = director1.createStudent();
        System.out.println(engineeringStudent);

        Director director2 = new Director(new MBAStudentBuilder());
        Student mbaStudent = director2.createStudent();
        System.out.println(mbaStudent);
    }
}
