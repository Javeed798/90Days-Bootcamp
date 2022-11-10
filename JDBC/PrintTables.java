package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PrintTables {
    static void displayEmployee(ResultSet result) throws SQLException {
        while (result.next()){
        System.out.printf("%-3s %-9s %-19s %-27s\n", result.getInt(1), result.getString(2),result.getString(3),result.getInt(4)
            );
        }
    }
}
