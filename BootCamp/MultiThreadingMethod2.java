package BootCamp;

import java.util.Scanner;

class Mul1 implements Runnable {
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

class Mul2 implements Runnable {
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

class Mul3 implements Runnable {
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

public class MultiThreadingMethod2 {
    public static void main(String[] args) {
        Mul1 e1 = new Mul1();
        Mul2 e2 = new Mul2();
        Mul3 e3 = new Mul3();

        // need to create a Thread type object

        Thread th1 = new Thread(e1);
        Thread th2 = new Thread(e2);
        Thread th3 = new Thread(e3);
        th1.start();
        th2.start();
        th3.start();
    }
}
