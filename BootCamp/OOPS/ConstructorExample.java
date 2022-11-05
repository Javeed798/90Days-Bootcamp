package BootCamp.OOPS;

class Customer2 {
    private String name;
    private int age;
    private long mobile;

    public Customer2() {
        this.name = "Ninja";
        this.age = 33;
        this.mobile = 1111111111;
    }

    public Customer2 (String name, int age, long mobile) {
        // this method refers to the above customer2 constructor //
        this();
        this.age = age;
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public long getMobile() {
        return mobile;
    }
}


public class ConstructorExample {
    public static void main(String[] args) {
        Customer2 c = new Customer2("Javeed", 25, 565646464);
        System.out.println(c.getAge() + " " + c.getMobile() + " " + c.getName());

    }
}
