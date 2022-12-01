package BootCamp.PracticeProgramming;

public class BringNegativeValuesToFIrstAndDontSortPositiveValues2 {
	public static void main(String[] args) {
		int[] arr = { 5, -1, 3, -1, 4, 5, -1, 3, -1, 8, 2 };

		int count = 0;
		int i = 0;
		for (i = arr.length - 1; i - count >= 0; i--) {
			if (arr[i - count] == -1) {
				count++;
			}
			arr[i] = arr[i - count];
		}
		while (i >= 0) {
			arr[i] = -1;
			i--;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}
}
