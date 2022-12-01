package BootCamp.PracticeProgramming;

public class SubArrayOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		subArray(arr, 2);
		
	}
	
	public static void subArray(int arr[], int k) {
		for(int i = 0; i < arr.length - k; i++) {
			for(int j = i; j< i+k; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println(" ");
		}
	}

}
