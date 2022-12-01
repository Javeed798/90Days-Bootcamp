package BootCamp.PracticeProgramming;

public class BringZeroesToOnePartAndOnesToAnotherPart {
	public static void main(String[] args) {
		int[] arr = {0,0,1,0,1,0,1,0,1};
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == count) {
				count++;
			}
		}
		
		for(int i = 0; i <= count; i++) {
			arr[i] = 0;
			System.out.print(arr[i] + " ");
		} 
		
		for(int j = count; j < arr.length;j++) {
			arr[j] = 1;
			System.out.print(arr[j] + " ");
		}
		
 	}
}
