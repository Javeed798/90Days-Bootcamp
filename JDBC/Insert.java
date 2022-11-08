package JDBC;

import java.sql.*;

public class Insert {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String pwd = "K@rishma11";
        Connection con = null;
        Statement stmt = null;
        ResultSet res = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver installed successfully");

            con =  DriverManager.getConnection(url,username,pwd);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,0);

            String query1 = "insert into emp (`id`,`name`,`dsig`,`salary`) values (6,'robb','SME', 50000)";
            String query2 = "insert into emp (`id`,`name`,`dsig`,`salary`) values (7,'robb','SME', 50000)";
            String query3 = "insert into emp (`id`,`name`,`dsig`,`salary`) values (8,'robb','SME', 50000)";

            stmt.execute(query1);
            stmt.execute(query2);
            stmt.execute(query3);

            System.out.println("query executed successfully");

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
