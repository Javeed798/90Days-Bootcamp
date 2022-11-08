package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class BatchFile3 {
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

            String query1 = "insert into emp (`id`,`name`,`dsig`,`salary`) values (9,'robb','SME', 50000)";
            String query2 = "insert into emp (`id`,`name`,`dsig`,`salary`) values (10,'robb','SME', 50000)";
            String query3 = "insert into emp (`id`,`name`,`dsig`,`salary`) values (11,'robbbbb','SME', 50000)";

            // using the batch file to reduce the number of knocks in the hard disk to make the application faster

            stmt.addBatch(query1);
            stmt.addBatch(query2);
            stmt.addBatch(query3);

            stmt.executeBatch();


        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
