package com.solidPrinciple.Dependency_Inversion_Principle.after;

class App {
    private Database db;
    public App(Database db) { this.db = db; } // depends on abstraction
}