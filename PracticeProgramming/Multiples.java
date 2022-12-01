package BootCamp.PracticeProgramming;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = n; i<=100; i++){
            if(i % n ==0 && i % m == 0){
                System.out.print(i +" ");
            }
        }
    }
}
