package JDBC.DTO;

public class Employee {
          private String name;
          private int id;
          private String designation;
          private int salary;

          public Employee(){

          }
        public Employee( int id,String name, String designation, int salary){
            this.name = name;
            this.id = id;
            this.salary = salary;
            this.designation = designation;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }


//        conversion of addresses to string
        public String toString(){
              return id + " " + name + " " + designation + " " + salary;
        }
}

