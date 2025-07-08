package com.AllBehavioralDesignPattern.Singleton.Lazyintialization;


public class DBconnection {

    private static DBconnection createobj=new DBconnection();

    private DBconnection(){}

    private static DBconnection getBconnection(){

        if(createobj==null)
        {
            return new DBconnection();
        }
        return createobj;
    }
}
