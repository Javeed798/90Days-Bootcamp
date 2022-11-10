package JDBC;


import JDBC.DAO.EmployeeDAO;
import JDBC.DAO.EmployeeDAOImpl;
import JDBC.DTO.Employee;

import java.util.List;
import java.util.Scanner;

public class DaoDriver {
    public static void main(String[] args) {
        EmployeeDAOImpl emplDAOImpl = new EmployeeDAOImpl();

//        getEmployees();
        List<Employee> employees = emplDAOImpl.getEmployees();

        for (Employee e : employees ) {
            System.out.println(e);
        }


        // getting a single user
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id to be updated : ");
        int id = sc.nextInt();
        Employee e = emplDAOImpl.getEmployee(id);
        System.out.println(e);


        // updating
        System.out.println("Enter the salary to be updated : ");
        int newSalary = sc.nextInt();
        e.setSalary(newSalary);
        System.out.println(emplDAOImpl.updateEmployee(e));

        // inserting
        System.out.println("Enter id to be inserted : ");
        int newId = sc.nextInt();
        System.out.println("Enter name to be inserted");
        String newName = sc.next();
        System.out.println("Enter designation to be inserted");
        String newDesisgnation = sc.next();
        sc.nextLine();
        System.out.println("Enter salary to be inserted");
        int newSalary1 = sc.nextInt();
        boolean e1= emplDAOImpl.insertEmployee(newId,newName,newDesisgnation,newSalary1);
        System.out.println(e1);

//        deleting

        System.out.println("Enter the id to be deleted");
        int id2 = sc.nextInt();
        System.out.println(emplDAOImpl.deleteEmployee(id2));


    }
}
