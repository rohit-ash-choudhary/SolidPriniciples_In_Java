package com.NullDesignPattern.After;

public class NullUser implements User {
    public void printDetails() {
        System.out.println("User not found in the system.");
    }
}

