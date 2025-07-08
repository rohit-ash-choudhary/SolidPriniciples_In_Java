package com.AllBehavioralDesignPattern.Singleton.DoubleLocking;

import com.AllBehavioralDesignPattern.Singleton.Sychronized.DBconnection;

public class DbConnection {

    private static DbConnection createobj=new DbConnection();

    private DbConnection(){}
    /* as sycnhronized expensive process when First thread-1 come and check its object is not created
       then second thread-2 come and check lock object is create so its return same for other

       every thread check is wasting of time as object already created
       so we use double locking.
       */
     static DbConnection getBconnection(){

        if(createobj==null)
        {
            synchronized (DbConnection.class)
            {
                if(createobj==null)
                {
                    return new DbConnection();
                }
            }

        }
        return createobj;
    }
}
