package src.servlet.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static Connection conn = null;
    public static  Connection getConn() {
        if(conn != null)
            return  conn;
        else {
            try{
                String url = "jdbc:mysql://localhost:3306/booking_bus";
                String driver = "com.mysql.jdbc.Driver";
                String username = "root";
                String password = "";
                Class.forName(driver);
                conn = DriverManager.getConnection(url, username, password);
            }catch (SQLException e) {
                e.printStackTrace();
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
