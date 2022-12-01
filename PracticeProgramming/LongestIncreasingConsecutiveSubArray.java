package BootCamp.PracticeProgramming;

import java.util.Scanner;

public class LongestIncreasingConsecutiveSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[sc.nextInt()];
		
		for(int i = 0; i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		
		int start = 0;
		int end = 0,si=0,ei=0;
		
		for(int i = 0; i< ar.length-1;i++) {
			if(ar[i] - ar[i+1] == -1) {
				ei++;
			}else {
				if(ei - si > end - start) {
					start = si;
					end = ei;
				}
				si = i+1;
				ei = i+1;
			}
		}
		
		for(int i = start; i <= end; i++) {
			System.out.println(ar[i]);
		}
	}

}
