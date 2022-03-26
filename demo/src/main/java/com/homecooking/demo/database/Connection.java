package com.homecooking.demo.database;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static Connection myConnection;

    public static Connection getConnection(){
        if(myConnection == null) {
            try {
                myConnection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajeria?serverTimezone=UTC", "root", "homecooking23!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return myConnection;
    }

}
