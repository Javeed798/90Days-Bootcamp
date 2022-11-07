/*

//The Accounting department of the fair committee wants a console application
 that can estimate the total revenue by rent from an exhibition. So write a program
that accepts the stall details of an exhibition that includes the stallArea which is
 used for computing the stallCost. Using threads, calculate the stallCost of each
 stall and in the main method, print the consolidated data.

Create a class Stall which implements Runnable interface with the following
private attributes, Attributes Datatype
        stallName String
        details String
        stallArea Double
        owner String
        stallCost Double

Need to create constructors with and without parameters and parameterized constructor
doesnt have stall cost and finally we need to find the area of all stalls

 */

package BootCamp;

import java.util.Scanner;

class Stall implements Runnable{
    private String stallName;
    private String details;
    private double stallArea;
    private double stallCost;
    private String owner;

    public void run() {
        stallCost = stallArea * 150;
    }
    public Stall() {

    }

    public Stall (String stallName, String details, double stallArea, String owner) {
        this.details = details;
        this.stallArea = stallArea;
        this.stallName = stallName;
        this.owner = owner;
    }

    public String getStallName() {
        return stallName;
    }

    public String getDetails() {
        return details;
    }

    public double getStallArea() {
        return stallArea;
    }

    public double getStallCost() {
        return stallCost;
    }

    public String getOwner() {
        return owner;
    }

}

public class MultiThreadingProblemSolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of stalls : ");
        int n = sc.nextInt();
        sc.nextLine();

        Stall[] stalls = new Stall[n];


        // to print all the stall names and split them according to no of stalls
        for (int i =0; i < n; i++) {
            String s = sc.nextLine();
            String[] split = s.split(",");
            stalls[i] = new Stall(split[0], split[1], Integer.parseInt(split[2]), split[3]);
        }

        // to create a new stack frame we need to create a thread object

        for (int i = 0; i < n; i++) {
            Thread t = new Thread(stalls[i]);
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        double totalCost = 0.0;

        for (int i = 0; i < n; i++) {
            totalCost += stalls[i].getStallCost();
        }
        System.out.println(totalCost);
    }
}




















