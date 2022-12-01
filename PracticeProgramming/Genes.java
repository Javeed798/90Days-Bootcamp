package BootCamp.PracticeProgramming;

import java.util.Scanner;

public class Genes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first gene");
        char x = sc.next().charAt(0);
        System.out.println("Enter second gene");
        char y = sc.next().charAt(0);

        if (x =='B' || y=='B'){
            System.out.println('B');
        } else if (x=='R' || y=='R') {
            System.out.println('R');
        }else if (x=='B' || y=='R') {
            System.out.println('B');
        }  else {
            System.out.println('G');
        }

    }
}
