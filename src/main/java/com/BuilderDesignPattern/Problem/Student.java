package com.BuilderDesignPattern.Problem;

public class Student {

    int rollno;  //mandotry
    String first_name; //optional


    String last_name;  //optional
    String Fathername;  //optional
    String address;  //optional
    String pincode;  //optional
    int batch;


   // Problem :1 Too parameter or creating big constructor
    public Student(int rollno, String first_name, String last_name, String fathername, String address, String pincode, int batch) {
        this.rollno = rollno;
        this.first_name = first_name;
        this.last_name = last_name;
        Fathername = fathername;
        this.address = address;
        this.pincode = pincode;
        this.batch = batch;
    }

     //Problem 2: creating small small constructor
     public Student(int rollno, String first_name, String last_name) {
         this.rollno = rollno;
         this.first_name = first_name;
         this.last_name = last_name;
     }

    public Student(String address, String pincode) {
        this.address = address;
        this.pincode = pincode;
    }

    //so we need to create huge number of construcor
    //so resolve this builder Design pattern in picture
}
