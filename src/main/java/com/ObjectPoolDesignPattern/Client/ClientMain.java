package com.ObjectPoolDesignPattern.Client;

import com.ObjectPoolDesignPattern.PoolManager.DBConnectionPoolManager;
import com.ObjectPoolDesignPattern.Resource.DBConncetion;

public class ClientMain {
    public static void main(String[] args) {
        DBConnectionPoolManager poolManager = DBConnectionPoolManager.getInstance();

        DBConncetion dbConnection1 = poolManager.getDBConnection();
        DBConncetion dbConnection2 = poolManager.getDBConnection();
        DBConncetion dbConnection3 = poolManager.getDBConnection();
        DBConncetion dbConnection4 = poolManager.getDBConnection();
        DBConncetion dbConnection5 = poolManager.getDBConnection();
        DBConncetion dbConnection6 = poolManager.getDBConnection();

        poolManager.getDBConnection(); // 7th connection (null expected)

        poolManager.releaseDBConnection(dbConnection6); // releasing one
    }
}
