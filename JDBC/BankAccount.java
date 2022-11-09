package JDBC;

import java.sql.*;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bank";
        String username = "root";
        String pwd = "K@rishma11";
        Connection con = null;

        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url,username,pwd);
            System.out.println("welcome to ninja bank");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your account number");
            int acc_name = sc.nextInt();
            System.out.println("Enter the pin : ");
            int pin = sc.nextInt();

           PreparedStatement pstmt1 = con.prepareStatement("select * from account where acc_name = ? and pin = ? ");

           pstmt1.setInt(1,acc_name);
           pstmt1.setInt(2,pin);

           ResultSet res1 = pstmt1.executeQuery();
           res1.next();
           String name = res1.getString(2);
           int balance = res1.getInt(4);

            System.out.println("Helloo welcome " + name);
            System.out.println("your balance is "  + balance);
//            Transfer module

            System.out.println("----------Transaction Details----------");
            System.out.println("Enter the beneficiary account number ");
            int ben_acc = sc.nextInt();
            System.out.println("Enter the transaction amount");
            int t_amount = sc.nextInt();

            con.setAutoCommit(false);
            Savepoint s = con.setSavepoint();
            PreparedStatement pstmt2 = con.prepareStatement("update account set balance = balance + ? where acc_name = ? ");
            pstmt2.setInt(1,t_amount);
            pstmt2.setInt(2,ben_acc);
            pstmt2.executeUpdate();
            PreparedStatement pstmt6 = con.prepareStatement("update account set balance = balance - ? where acc_name = ? ");
            pstmt6.setInt(1,t_amount);
            pstmt6.setInt(2,acc_name);
            pstmt6.executeUpdate();

//            confirming with yes or no

            System.out.println(name +" with " + acc_name + " has sent u amount" + t_amount);
            System.out.println("Press Y to accept");
            System.out.println("Press N to reject");

            String choice = sc.next();

            if (choice.equals("Y")) {
                PreparedStatement pstmt3 = con.prepareStatement("update account set balance = balance + ? where acc_name = ?");
                pstmt3.setInt(1,t_amount);
                pstmt3.setInt(2,ben_acc);
                pstmt3.executeUpdate();

                PreparedStatement pstmt4 = con.prepareStatement("select * from account where acc_name = ? ");
                pstmt4.setInt(1,ben_acc);
                ResultSet res2 = pstmt4.executeQuery();
                res2.next();
                System.out.println("Updated balance is" + res2.getInt(4));
            } else {
                con.rollback(s);
                PreparedStatement pstmt5 = con.prepareStatement("select * from account where acc_name = ? ");
                pstmt5.setInt(1,ben_acc);
                ResultSet res2 = pstmt5.executeQuery();
                res2.next();
                System.out.println("Existing balance is" + res2.getInt(4));
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
