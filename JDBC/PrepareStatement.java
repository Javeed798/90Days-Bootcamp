package JDBC;

import java.sql.*;
import java.util.Scanner;

public class PrepareStatement {
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
                System.out.println("Enter the id : ");
                int id = sc.nextInt();

                System.out.println("Enter the name : ");
                String name = sc.next();

                System.out.println("Enter the designation : ");
                String dsig = sc.next();

                System.out.println("Enter the salary : ");
                int salary = sc.nextInt();
                pstmt.setInt(1,id);
                pstmt.setString(2,name);
                pstmt.setString(3,dsig);
                pstmt.setInt(4,salary);
                pstmt.execute();
                System.out.println("Query executed successfully");

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

