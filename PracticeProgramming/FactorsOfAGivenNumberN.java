package BootCamp.PracticeProgramming;

import java.util.Scanner;

public class FactorsOfAGivenNumberN {
    static boolean isPrime(int n) {
//        int count = 0;
//        for (int i = 1; i <=n; i++){
        for (int i = 2; i <=n/2; i++){
            if (n % i == 0) {
//                System.out.println(i);
//                count++;
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        if (isPrime(n)){
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }

        // print all the prime numbers till n
        for (int i = 2; i <= n; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }


}
