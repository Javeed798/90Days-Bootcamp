package BootCamp;

import java.util.Scanner;

class OneRun extends Thread {

    public void run() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        if (name.equals("add")) {
            addition();
        } else if (name.equals("char")) {
            printChars();
        } else {
            printNums();
        }
    }

    public void addition() {
        System.out.println("Addition started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number ");
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println("Addition ended");
    }

    public void printChars() {
        for (int i = 65; i <=75; i++) {
            System.out.println((char)i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printNums(){
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


public class MultiThreadingUsingSingleRun {
    public static void main(String[] args) {
        OneRun o1 = new OneRun();
        OneRun o2 = new OneRun();
        OneRun o3 = new OneRun();

        o1.setName("add");
        o2.setName("char");
        o3.setName("num");

        o1.start();
        o2.start();
        o3.start();

    }
}
