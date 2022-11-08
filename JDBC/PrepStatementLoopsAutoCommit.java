package JDBC;

import java.sql.*;
import java.util.Scanner;

public class PrepStatementLoopsAutoCommit {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String pwd = "K@rishma11";
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet res = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,pwd);
            String query = "insert into emp (`id`,`name`,`dsig`,`salary`) values (?,?,?,?)";
            pstmt = con.prepareStatement(query);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int n = sc.nextInt();

            con.setAutoCommit(false);
            for (int i = 1; i<=n; i++) {
                int id = sc.nextInt();
                String name = sc.next();
                String dsig = sc.next();
                int salary = sc.nextInt();

                pstmt.setInt(1,id);
                pstmt.setString(2,name);
                pstmt.setString(3,dsig);
                pstmt.setInt(4,salary);
                pstmt.execute();
            }
            con.commit();

        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
