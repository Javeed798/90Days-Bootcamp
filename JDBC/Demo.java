package JDBC;

import java.sql.*;

public class Demo {
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
            String query = "select * from emp";
            res =  stmt.executeQuery(query);
            res.next();

            ResultSetMetaData metaData =  res.getMetaData();

            for (int i =1; i< metaData.getColumnCount(); i++) {
                System.out.println(metaData.getColumnName(i) + " " + metaData.getColumnTypeName(i));
            }
            while(res.next() == true) {
                System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3) + " " + res.getInt(4) );
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            res.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
