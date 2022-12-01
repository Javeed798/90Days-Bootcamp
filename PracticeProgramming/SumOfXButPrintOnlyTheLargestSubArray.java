package BootCamp.PracticeProgramming;

import java.util.Scanner;

public class SumOfXButPrintOnlyTheLargestSubArray {

	public static void main(String[] args) {
		int[] arr = {5,1,2,4,9,3,1,3,3};
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int k = arr.length; k >= 1 ; k--) {
			for(int i = 0; i< arr.length -k;i++) {
				int sum = 0;
				for(int j =i; j < i + k;j++) {
					sum = sum + arr[j];
				}
				if(sum == x) {
					for(int j = i; j<i+k;j++) {
						System.out.print(arr[j] + " ");
					}
					return;
				}
			}
			
		}
	}

}
