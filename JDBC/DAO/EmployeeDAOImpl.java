package JDBC.DAO;

import JDBC.Connectors.ConnectorFactory;
import JDBC.DTO.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{

    public List getEmployees() {
        ArrayList<Employee> empList = null;
        try {
            Connection con = ConnectorFactory.requestConnection();
            String query = "select * from emp";
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(query);
            empList = new ArrayList<Employee>();

            // we need to get all the fields soo we r looping
            while (res.next() == true){
                int id = res.getInt(1)  ;
                String name = res.getString(2);
                String dsig = res.getString(3);
                int salary = res.getInt(4);
               Employee e =  new Employee(id,name,dsig,salary);
               empList.add(e);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return empList;
    }

    public Employee getEmployee(int id) {
        Employee e = null;
        try {
            Connection con = ConnectorFactory.requestConnection();
            String query = "select * from emp where id = ? ";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1,id);
            ResultSet res = pstmt.executeQuery();
            res.next();

            // no need to loop because only one field with selected id will be displayed
            e = new Employee(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4));

        }  catch (Exception e1) {
            e1.printStackTrace();;
        }
        return e;
    }

    public boolean insertEmployee(int id, String name, String designation, int salary) {
        boolean v = false;
        try{
            Connection con = ConnectorFactory.requestConnection();
            String query = "insert into emp (id,name,dsig,salary) values (?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.setString(2,name);
            pstmt.setString(3,designation);
            pstmt.setInt(4,salary);
            v = pstmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (v){
            return true;
        } else {
            return false;
        }
    }

    public boolean updateEmployee(Employee e) {
        int i = 0;
        try{
            Connection con = ConnectorFactory.requestConnection();
            String query = "update emp set salary = ? where id = ? ";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1,e.getSalary());
            pstmt.setInt(2,e.getId());
            i = pstmt.executeUpdate();

        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteEmployee(int id) {
        boolean p = false;
        try{
            Connection con = ConnectorFactory.requestConnection();
            String query = "delete from emp where id = ? ";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1,id);
            p = pstmt.execute();
        } catch (Exception e){
            e.printStackTrace();
        }
        if (p){
            return true;
        } else {
            return false;
        }
    }
}
