package BootCamp;

import java.util.Scanner;

class Emp1 extends Thread {
    public void run() {
        System.out.println("Addition started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number ");
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println("Addition ended");
    }
}

class Emp2 extends Thread {
    public void run() {
        for (int i = 65; i <=75; i++) {
            System.out.println((char)i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class Emp3 extends Thread {
    public void run() {
        for (int i = 65; i <=75; i++) {
            System.out.println(i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

public class MultiThreadingMethod1 {
    public static void main(String[] args) {
        Emp1 e1 = new Emp1();
        Emp2 e2 = new Emp2();
        Emp3 e3 = new Emp3();

        e1.start();
        e2.start();
        e3.start();
    }
}
