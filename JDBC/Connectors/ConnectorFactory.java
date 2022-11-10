package JDBC.Connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorFactory {

    static Connection con = null;
    static String url = "jdbc:mysql://localhost:3306/employee";
    static String username = "root";
    static String password = "K@rishma11";

    public static Connection requestConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url,username,password);
        return con;
    }
}
