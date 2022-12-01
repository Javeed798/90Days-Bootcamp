package BootCamp.PracticeProgramming;

public class BringNegativeValuesToFIrstAndDontSortPositiveValues {
	public static void main(String[] args) {
		int[] arr = { 5, -1, 3, -1, 4, 5, 3, -1, 8, 2 };
		int res[] = new int[arr.length];

		int i = arr.length - 1;
		int j = res.length - 1;
		while (i >= 0) {
			if (arr[i] > 0) {
				res[j] = arr[i];
				j--;
			}
			i--;
		}
		while (j >= 0) {
			res[j] = -1;
			j--;
		}
		for (int k = 0; k < res.length; k++) {
			System.out.print(res[k] + " ");
		}
	}
}
