package BootCamp.PracticeProgramming;

public class Merge3SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6, 7, 8, 9 };
		int[] arr3 = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 };

		int res[] = merge3Array(arr1, arr2, arr3);
		for (int k = 0; k < res.length; k++) {
			System.out.print(res[k] + " ");
		}
	}

	public static int[] merge3Array(int[] arr1, int[] arr2, int[] arr3) {
		int[] res = new int[arr1.length + arr2.length + arr3.length];

		int i = 0;
		int j = 0;

		while (j < res.length) {
			if (i < arr1.length) {
				res[j] = arr1[i];
				j++;
			}
			if (i < arr2.length) {
				res[j] = arr2[i];
				j++;
			}
			if (i < arr3.length) {
				res[j] = arr3[i];
				j++;
			}
			i++;
		}
		return res;
	}

}
