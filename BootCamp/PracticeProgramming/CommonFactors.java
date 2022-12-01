package BootCamp.PracticeProgramming;

import java.util.Scanner;

public class CommonFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i= n; i <=100;i++){
            if (n % i == 0 && m % i == 0){
                System.out.println(i);
            }
        }
    }
}
