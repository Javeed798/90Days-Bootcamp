package BootCamp;

import java.util.Scanner;

public class FindLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ln = n % 10;
        System.out.println(ln);
    }
}
