package BootCamp.PracticeProgramming;

public class Merge2SortedArrays {
	public static void main(String[] args) {
		int[] arr1 = {3,5,7,9,13};
		int[] arr2 = {1,2,3,5,9,15,17,19};
		
		int[] res = mergeArrays(arr1,arr2);
		for(int i = 0; i < res.length;i++) {
			System.out.print(res[i] + " ");
		}
	}
	
	public static int[] mergeArrays(int[] arr1, int[] arr2){
		int[] res = new int[arr1.length + arr2.length];
		
		int i = 0, j = 0, k = 0;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				res[k++] = arr1[i++];
//				k++;
//				i++;
			} else {
				res[k++] = arr2[j++];
//				k++;
//				j++;
			}
		}
		
//		if anyone array gets completed then we need to
//		fill the complete array
		
		while(i < arr1.length) {
			res[k++] = arr1[i++];
//			k++;
//			i++;
		}
		while(j < arr2.length) {
			res[k++] = arr2[j++];
//			k++;
//			j++;
		}
		
		return res;
	}
}


