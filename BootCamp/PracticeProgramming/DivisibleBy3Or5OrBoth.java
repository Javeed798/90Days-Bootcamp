package BootCamp.PracticeProgramming;

import java.util.Scanner;

public class DivisibleBy3Or5OrBoth {
    public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
       int n = sc.nextInt();

       if (n % 3 == 0 && n % 5 == 0) {
           System.out.println("BTM");
       } else if (n % 5 == 0) {
           System.out.println("Academy");
       } else if (n % 3 == 0) {
           System.out.println("Tap");
       }
    }
}
