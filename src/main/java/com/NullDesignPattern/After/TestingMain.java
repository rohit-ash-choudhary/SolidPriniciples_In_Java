package com.NullDesignPattern.After;

public class TestingMain {
    public static void main(String[] args) {
        User user1 = UserFactory.getUser("Ashhh");
        User user2 = UserFactory.getUser("Unknown");

        user1.printDetails(); // Output: User found: Ashhh
        user2.printDetails(); // Output: User not found in the system.
    }
}
