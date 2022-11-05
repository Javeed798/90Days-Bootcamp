package BootCamp.OOPS;

class Customer1 {
    private String name;
    private int age;

    public void setDetails(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}

public class EncapsulationExample2 {
    public static void main(String[] args) {
        Customer1 c = new Customer1();
        c.setDetails("Javeed",21);
        System.out.println(c.getAge() + " " + c.getName());
    }
}
