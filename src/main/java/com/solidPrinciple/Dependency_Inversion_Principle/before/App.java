package com.solidPrinciple.Dependency_Inversion_Principle.before;

public class App {
    MySQLDatabase db = new MySQLDatabase(); // tightly coupled
}
