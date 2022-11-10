package JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

// write a program to take data of an employee from the user and store in the database;
public class Revision4 {
    private static FileInputStream inputStream;
    private static Connection con;
    private static Statement statement;
    private static ResultSet result;

    private final static String QUERY = "DELETE from `emp` where `id` = 25";

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

            PreparedStatement pstmt = con.prepareStatement("insert into emp (`id`,`name`,`dsig`,`salary`) values(?,?,?,?)");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            String name = sc.next();
            String dsig = sc.next();
            sc.nextLine();
            int salary = sc.nextInt();
            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            pstmt.setString(3,dsig);
            pstmt.setInt(4,salary);

            pstmt.executeUpdate();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try {
                close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
