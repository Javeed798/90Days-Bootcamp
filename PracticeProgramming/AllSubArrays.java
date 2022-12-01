package BootCamp.PracticeProgramming;

public class AllSubArrays {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,10,11,12,13,14,15,16};
		
		for(int k=1;k <= arr.length;k++) {
			for(int i = 0; i<= arr.length-k;i++) {
				for(int j = i; j < i+k;j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
