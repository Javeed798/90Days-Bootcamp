package JDBC;

import java.sql.*;

public class UpdateeAndDelete {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String pwd = "K@rishma11";
        Connection con = null;
        Statement stmt  = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,pwd);
            stmt = con.createStatement();
//            String query = "update emp set salary = salary + salary * 5";
            String query = "delete from emp where name='robbbbb'";
            System.out.println("No of rows updated : "+  stmt.executeUpdate(query));

        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            con.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
