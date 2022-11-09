package BootCamp.PracticeProgramming;

import java.util.Scanner;

public class CodeChef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int target = sc.nextInt();
            int completedOvers = sc.nextInt();
            int myScore = sc.nextInt();

            if(((20-completedOvers)*6*6)+myScore > target) {
                System.out.println("Yes");
            } else {
                System.out.println("NO");
            }
        }
    }


