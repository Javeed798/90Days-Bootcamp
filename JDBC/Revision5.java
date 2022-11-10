package JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Revision5 {
    private static FileInputStream inputStream;
    private static Connection con;
    private static Statement statement;
    private static ResultSet result;
    private static PreparedStatement stmt;

    private final static String QUERY = "UPDATE emp set salary = salary + ? where name = ?";

    static void close() throws SQLException, IOException {
        if (result!=null) {
            result.close();
        }
        if (statement != null){
            statement.close();
        }
        if (con != null){
            con.close();
        }
        if (inputStream != null){
            inputStream.close();
        }
    }

    public static void main(String[] args)  {
        try {
//            CONNECTION PART START
            inputStream = new FileInputStream("C:\\Users\\javee\\IdeaProjects\\90Days-Bootcamp\\JDBC\\mysqlInfo.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            con = DriverManager.getConnection(url,username,password);
//            CONNECTION PART END
            con.setAutoCommit(false);
            statement = con.createStatement();
//            result = statement.executeQuery(QUERY);


            boolean confirm = transaction();
            if (confirm){
                con.commit();
            } else {
                con.rollback();
            }



        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                close();
            } catch (SQLException | IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static boolean transaction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter senders name :");
        String sender = sc.next();
        System.out.println("Enter recievers name : ");
        String receiver = sc.next();
        System.out.println("Enter amount ");
        int amount = sc.nextInt();
        if (checkBalance(sender,amount)) {
            int x = updateBalance(sender,-amount);
            int y = updateBalance(receiver,amount);
            return confirm(x,y);
        } else {
            System.out.println("in sufficient funds");
            return false;
        }
    }

    private static boolean checkBalance(String sender, int amount) {
        try {
            String getSalary = "select `salary` from emp where name = ? ";
            stmt = con.prepareStatement(getSalary);
            stmt.setString(1,sender);
            ResultSet res = stmt.executeQuery();
            if (res.next()){
                int balance = res.getInt(1);
                return balance >= amount;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    private static boolean confirm(int x, int y) {
        if (x == 1 && y == 1){
            System.out.println("Are you sure to send the money (Yes or no)");
            Scanner sc = new Scanner(System.in);
            return "yes".equalsIgnoreCase(sc.next());
        } else {
            System.out.println("Transaction failed");
            return false;
        }
    }

    private static int updateBalance(String receiver, int amount) {
        try {
            stmt = con.prepareStatement(QUERY);
            stmt.setInt(1,amount);
            stmt.setString(2,receiver);
            int i = stmt.executeUpdate();
            return i;
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return 0;
    }
}
