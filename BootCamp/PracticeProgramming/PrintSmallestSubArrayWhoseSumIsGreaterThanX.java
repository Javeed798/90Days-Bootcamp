package BootCamp.PracticeProgramming;

public class PrintSmallestSubArrayWhoseSumIsGreaterThanX {

	public static void main(String[] args) {
	
		int arr[] = {1,5,45,6,0,19};
		for(int k = 0; k< arr.length;k++) {
			for(int i = 0; i<= arr.length-k; i++) {
				int sum = 0;
				for(int j = i; j < i + k; j++) {
					sum = sum + arr[j];
				}
				int count = 0;
				if(sum > 51) {
					for(int j = i; j<i+k;j++) {
						System.out.print(arr[j] + " ");
						count++;
					}
					System.out.println();
					System.out.println(count);
					return;
				}
			}
		}

	}

}
