package BootCamp.OOPS;

import java.util.Scanner;

class Circle {
    private float r;
    private static float pi;
    private float area;

    // using static block

    static  {
        pi = 3.147f;
    }

    public void setInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        r = sc.nextFloat();
//        pi = 3.147f;
    }

    public void area() {
         area = pi * r * r;
    }

    public void displayArea() {
        System.out.println("Area : " + area);
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setInput();
        circle.area();
        circle.displayArea();
    }

}
