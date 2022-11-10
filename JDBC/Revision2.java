package JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Revision2 {
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
            inputStream = new FileInputStream("C:\\Users\\javee\\IdeaProjects\\90Days-Bootcamp\\JDBC\\mysqlInfo.properties");
            Properties properties = new Properties();
            properties.load(inputStream);

            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            con = DriverManager.getConnection(url,username,password);
            statement = con.createStatement();
//            result= statement.executeQuery("select * from emp where id=2");
            result = statement.executeQuery("select * from emp");
            PrintTables.displayEmployee(result);
            statement.executeUpdate(QUERY);
            result = statement.executeQuery("select * from emp");

            while (result.next()){
                System.out.println(result.getString(2) + " " + result.getString(3));
            }

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
