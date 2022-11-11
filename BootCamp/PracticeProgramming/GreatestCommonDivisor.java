package BootCamp.PracticeProgramming;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = 0;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }

        for (int i = min; i>0;i--){
            System.out.println(i);
            break;
        }
    }
}
