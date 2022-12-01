package BootCamp.PracticeProgramming;
//
//import java.util.Scanner;
//
//public class CodeChef
//    {
//        public static void main (String[] args) throws java.lang.Exception
//        {
//            Scanner sc = new Scanner(System.in);
//            int target = sc.nextInt();
//            int completedOvers = sc.nextInt();
//            int myScore = sc.nextInt();
//
//            if(((20-completedOvers)*6*6)+myScore > target) {
//                System.out.println("Yes");
//            } else {
//                System.out.println("NO");
//            }
//        }
//    }
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<a.length;i++){
                b[i]=sc.nextInt();
            }
            int count = 0;
            for(int i = 0; i < a.length; i++) {
                int d;
                if(i == 0){
                    d = a[i] - 0;
                } else {
                    d = a[i] - a[i - 1];
                }

                if(b[i] <= d){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}



