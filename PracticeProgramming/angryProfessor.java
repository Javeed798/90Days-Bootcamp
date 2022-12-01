package BootCamp.PracticeProgramming;

import java.util.Scanner;

public class angryProfessor {

    static String angryProfessor(int k, int[] arr){
        int count = 0;
        for (int i = 0; i<arr.length;i++){
            if (arr[i] < 0 ){
                count++;
            }
        }

        if(count >= k){
            return "No";
        } else {
            return "Yes";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(angryProfessor.angryProfessor(k,a));
    }
}
