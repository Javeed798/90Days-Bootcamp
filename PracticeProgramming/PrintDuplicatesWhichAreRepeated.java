package BootCamp.PracticeProgramming;

public class PrintDuplicatesWhichAreRepeated {

	public static void main(String[] args) {
		int[] arr1 = { 3, 5, 6, 8, 9,11,13,15 };
		int[] arr2 = { 2, 3, 5, 6, 7, 8, 8, 9,15 };

//		for(int i = 0; i<arr1.length;i++) {
//			for(int j = 0; j<arr2.length;j++) {
//				if(arr1[i] == arr2[j]) {
//					System.out.print(arr2[j] + " ");
//					break;
//				}
//			}
//		}
		printDuplicates(arr1, arr2);
		System.out.println();
		printDuplicatesDescending(arr1,arr2);
	}

	private static void printDuplicates(int[] arr1, int[] arr2) {
		int i = 0, j = 0;
		int count = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				if (count > 0) {
					System.out.print(",");
				}
				System.out.print(arr1[i]);
				count++;
				i++;
				j++;
			} else if (arr1[i] < arr2[i]) {
				i++;
			} else {
				j++;
			}
		}
	}

	private static void printDuplicatesDescending(int[] arr1, int[] arr2) {
		int i = arr1.length - 1;
		int j = arr2.length - 1;

		int count = 0;
		while(i >=0 && j >= 0) {
			
			if(arr1[i] < arr2[j]) {
				System.out.print(arr1[i] +" ");
				i--;
				j--;
			} else if(arr1[i] < arr2[j]) {
				j--;
			} else {
				i--;
			}
			
			
			
			
			
			
			
			
			
			
		}
	}
}
