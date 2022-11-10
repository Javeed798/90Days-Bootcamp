package JDBC.DAO;

import JDBC.DTO.Employee;

import java.util.List;

public interface EmployeeDAO {

    //    access all details form db;
    List getEmployees();

    //    get a single employee
    Employee getEmployee(int id);

    //    inserting
    boolean insertEmployee(int id, String name, String designation, int salary);

    //    updating
    boolean updateEmployee(Employee e);

    //    deleting
    boolean deleteEmployee(int id);

}
