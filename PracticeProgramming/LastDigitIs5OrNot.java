package BootCamp.PracticeProgramming;

import java.util.Scanner;

public class LastDigitIs5OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 10 == 5) {
            System.out.println("Yes last digit is 5");
        } else {
            System.out.println("noo not");
        }
    }
}
