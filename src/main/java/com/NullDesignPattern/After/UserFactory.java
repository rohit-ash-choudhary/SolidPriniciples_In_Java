package com.NullDesignPattern.After;

public class UserFactory {
    private static final String[] users = {"Ashhh", "Rohitash", "Yash"};

    public static User getUser(String name) {
        for (String u : users) {
            if (u.equalsIgnoreCase(name)) {
                return new RealUser(name);
            }
        }
        return new NullUser(); // No null returned!
    }
}
