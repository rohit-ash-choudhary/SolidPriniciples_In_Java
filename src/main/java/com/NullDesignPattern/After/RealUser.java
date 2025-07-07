package com.NullDesignPattern.After;

public class RealUser implements User {
    private String name;

    public RealUser(String name) {
        this.name = name;
    }

    public void printDetails() {
        System.out.println("User found: " + name);
    }
}
