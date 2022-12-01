package BootCamp.PracticeProgramming;

public class BringZerosToLast {

	public static void main(String[] args) {
		int arr[] = { 3, 7, 0, 4, 0, 6, 0, 8, 0, 3 };

		int count = 0;
		int i = 0;
		for (i = 0; i + count < arr.length; i++) {
			if (arr[i + count] == 0) {
				count++;
			}
			arr[i] = arr[i + count];
		}
		while (i <= arr.length - 1) {
			arr[i] = 0;
			i++;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
