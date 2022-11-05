package BootCamp.OOPS;

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.name = "Javeed";
        c1.age = 21;
        c1.cID = 111;
        c1.city = 'B';
        c1.mobile = 781240681;
        System.out.println("name "+c1.name);
        System.out.println("age "+c1.age);
        System.out.println("cID "+c1.cID);
        System.out.println("mobile " +c1.mobile);
        System.out.println("city "+c1.city);

        System.out.println();

        c1.setDetails("Ninja");
        c1.setDetails(22);
        c1.setDetails(111f);
        c1.setDetails(665466554);
        c1.setDetails('C');

        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.cID);
        System.out.println(c1.mobile);
        System.out.println(c1.city);

    }
}

// not using method overloading
//class Customer {
//    String name;
//    int age;
//    int cID;
//    int mobile;
//    String city;
//
//    void setName(String n) {
//        name = n;
//    }
//    void setAge(int n) {
//        age = n;
//    }
//    void setcID(int n) {
//        cID = n;
//    }
//    void setMobile(int n) {
//        mobile = n;
//    }
//    void setCity(String n) {
//        city = n;
//    }
//
//}

//  Using method overloading

class Customer{
    String name;
    int age;
    float cID;
    long mobile;
    char city;

    void setDetails (String n) {
        name = n;
    }
    void setDetails (int n) {
        age = n;
    }
    void setDetails (float n) {
        cID = n;
    }
    void setDetails (long n) {
        mobile = n;
    }
    void setDetails (char n) {
        city = n;
    }




}