package com.AllBehavioralDesignPattern.Singleton.Sychronized;

public class DBconnection {

    private static DBconnection createobj=new DBconnection();

    public DBconnection(){}
 /* as sycnhronized expensive process when First thread-1 come and check its object is not created
    then second thread-2 come and check lock object is create so its return same for other

    every thread check is wasting of time as object already created
    so we use double locking.
    */
   synchronized   static DBconnection getBconnection(){

        if(createobj==null)
        {
            return new DBconnection();
        }
        return createobj;
    }
}
