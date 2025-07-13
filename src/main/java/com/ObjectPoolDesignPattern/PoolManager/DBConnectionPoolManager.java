package com.ObjectPoolDesignPattern.PoolManager;

import com.ObjectPoolDesignPattern.Resource.DBConncetion;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {

    private List<DBConncetion> freeConnectionsInPool = new ArrayList<>();
    private List<DBConncetion> connectionsCurrentlyInUse = new ArrayList<>();

    private static final int INITIAL_POOL_SIZE = 3;
    private static final int MAX_POOL_SIZE = 6;

    private static DBConnectionPoolManager dbConnectionPoolManagerInstance = null;

    private DBConnectionPoolManager() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            freeConnectionsInPool.add(new DBConncetion());
        }
    }

    public static DBConnectionPoolManager getInstance() {
        if (dbConnectionPoolManagerInstance == null) {
            synchronized (DBConnectionPoolManager.class) {
                if (dbConnectionPoolManagerInstance == null) {
                    dbConnectionPoolManagerInstance = new DBConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManagerInstance;
    }

    public synchronized DBConncetion getDBConnection() {
        if (freeConnectionsInPool.isEmpty() && connectionsCurrentlyInUse.size() >= MAX_POOL_SIZE) {
            return null;
        } else if (freeConnectionsInPool.isEmpty() && connectionsCurrentlyInUse.size() < MAX_POOL_SIZE) {
            freeConnectionsInPool.add(new DBConncetion());
        }

        DBConncetion dbConnection = freeConnectionsInPool.remove(freeConnectionsInPool.size() - 1);
        connectionsCurrentlyInUse.add(dbConnection);
        return dbConnection;
    }

    public synchronized void releaseDBConnection(DBConncetion dbConnection) {
        if (dbConnection != null) {
            connectionsCurrentlyInUse.remove(dbConnection);
            freeConnectionsInPool.add(dbConnection);
        }
    }
}