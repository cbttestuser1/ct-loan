package com.ct.pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static String url = "ec2-54-244-62-153.us-west-2.compute.amazonaws.com";
    private static String uname = "ctlqa";
    private static String pwd = "ctl987";

    public static void main(String[] args) {
        oracleConnection();
    }

    public static void oracleConnection() {

        try {
            Connection connection = DriverManager.getConnection(url, uname, pwd);
            System.out.println("Database connection successfully established.");
        } catch (SQLException e) {
            System.out.println("Database connection failed.");
            e.printStackTrace();
        }
    }


}
