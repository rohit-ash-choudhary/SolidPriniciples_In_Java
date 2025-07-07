package com.BuilderDesignPattern.Solution;



public class Student {

    int rollno;  //mandotry
    String first_name; //optional


    String last_name;  //optional
    String Fathername;  //optional
    String address;  //optional
    String pincode;  //optional
    int batch;
    String subject;
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }




   //Instead of Constructor we made BuilderObject


    public Student(StudentBuilder builder) {
        this.rollno = builder.rollno;
        this.first_name = builder.first_name;
        this.last_name = builder.last_name;
        this.Fathername = builder.Fathername;
        this.address = builder.address;
        this.pincode = builder.pincode;
        this.batch = builder.batch;
        this.subject=builder.subject;;
    }
    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", Fathername='" + Fathername + '\'' +
                ", address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                ", batch=" + batch +
                ", subject='" + subject + '\'' +
                '}';
    }


}

