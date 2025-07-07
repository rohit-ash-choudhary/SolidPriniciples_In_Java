package com.CompositeDesignPattern.Problem;

public class File {

    String filename;

    public File(String name)
    {
        this.filename=name;
    }

    public void ls(){
        System.out.println("This is my file "+filename);
    }


}
