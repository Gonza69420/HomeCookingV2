package AccessingSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
    private static Connection myConnection;

    public static Connection getConnection(){
        if(myConnection == null) {
            try {
                myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/homecooking", "root", "Pass12345");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return myConnection;
    }

}
