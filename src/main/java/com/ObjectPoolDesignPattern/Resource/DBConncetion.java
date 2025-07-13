package com.ObjectPoolDesignPattern.Resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConncetion {

    Connection mysqlconnection;

    public DBConncetion(){
        try {
            mysqlconnection= DriverManager.getConnection("url","username","password");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
