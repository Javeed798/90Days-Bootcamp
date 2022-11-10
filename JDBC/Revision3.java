package JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Revision3 {
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
            statement = con.createStatement();
            result = statement.executeQuery("select * from emp");
            PrintTables.displayEmployee(result);

//            INSERTING MULTIPLE ROWS
            String q1 = "INSERT INTO EMP (`id`,`name`,`dsig`,`salary`) values(27,'tootto','dev',4000)";
            String q2 = "INSERT INTO EMP (`id`,`name`,`dsig`,`salary`) values(28,'booto','alooo',6000)";
            String q3 = "INSERT INTO EMP (`id`,`name`,`dsig`,`salary`) values(29,'roo','too',1000)";

            statement.addBatch(q1);
            statement.addBatch(q2);
            statement.addBatch(q3);
            statement.executeBatch();

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
