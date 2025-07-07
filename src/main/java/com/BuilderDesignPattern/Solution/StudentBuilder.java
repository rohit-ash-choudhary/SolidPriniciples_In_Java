package com.BuilderDesignPattern.Solution;

public abstract class StudentBuilder {

    int rollno;
    String first_name;
    String last_name;
    String Fathername;
    String address;
    String pincode;
    int batch;
    String subject;

    public StudentBuilder setRollno(int rollno) {
        this.rollno = rollno;
        return this;
    }

    public StudentBuilder setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public StudentBuilder setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public StudentBuilder setFathername(String fathername) {
        this.Fathername = fathername;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setPincode(String pincode) {
        this.pincode = pincode;
        return this;
    }

    public StudentBuilder setBatch(int batch) {
        this.batch = batch;
        return this;
    }

    public abstract StudentBuilder setSubject(); // set default subject

    public Student build() {
        return new Student(this);
    }
}