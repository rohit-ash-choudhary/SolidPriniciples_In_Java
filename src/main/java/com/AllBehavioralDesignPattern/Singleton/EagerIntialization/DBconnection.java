package com.AllBehavioralDesignPattern.Singleton.EagerIntialization;

public class DBconnection {
    private static DBconnection dbcon=new DBconnection();

    private DBconnection(){

    }

    public static DBconnection geDBconnection(){


            return new DBconnection();

    }

}
