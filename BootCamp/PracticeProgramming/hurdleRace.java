package BootCamp.PracticeProgramming;


import java.util.Scanner;

public class hurdleRace {
    static int hurdle(int k, int[] a){
        int max = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
      int noOfPotions = max - k;

        if (noOfPotions > 0) {
            return noOfPotions;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       int[] a = new int[n];
       for (int i = 0; i<a.length; i++){
           a[i] = sc.nextInt();
       }
        System.out.println(hurdleRace.hurdle(k,a));

    }
}
