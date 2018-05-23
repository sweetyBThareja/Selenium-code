package com.sweety.automation;

import java.sql.*;

public class JDBCSingleton {

    private static JDBCSingleton jdbc;
    static String url = "";
    static String userName = "";
    static String password = "";

    private JDBCSingleton(){

    }

    public static JDBCSingleton getInstance(){
        if(jdbc == null){
            jdbc = new JDBCSingleton();
        }
        return jdbc;
    }

    //To get connection for methods like insert and view:

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        Connection conn = null;

        Class.forName("com.mysql.jdbc.driver");
        conn = DriverManager.getConnection(url, userName, password);
        return conn;
    }

    //to insert data in db

    //to view data in db

    public void viewData(String name) throws ClassNotFoundException{
        Connection conn = null;
        PreparedStatement ps = null;

        ResultSet rs = null;

        try{
            conn = this.getConnection();
            ps = conn.prepareStatement("select * from egr_user where email_id=''");
        }catch (SQLException e){
            System.out.println(e);
        }
    }

}
