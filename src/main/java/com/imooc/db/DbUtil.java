package com.imooc.db;

import java.sql.*;

public class DbUtil {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/imooc";
    private static final String user = "root";
    private static final String password = "123456";

    private static Connection con;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return con;
    }
}
