package BootCamp.PracticeProgramming;

public class CIelAndFloor {
	public static int ciel(int[] arr, int key) {
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		while(low <= high) {
			mid = (low + high)/2;
			if(key == arr[mid]) {
				return arr[mid];
			}else if(key < arr[mid]) {
				high = mid -1;
			}else {
				low = mid + 1;
			}
		}
		if(low < arr.length) {			
			return arr[low];
		} else {
			return -1;
		}
	}
	
	public static int floor(int[] arr, int key) {
		int low = 0;
		int high = arr.length-1;
		int mid =0;
		while(low <= high) {
			mid = (low + high)/2;
			if(key == arr[mid]) {
				return arr[mid];
			}else if(key < arr[mid]) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		if(high >= 0) {			
			return arr[high];
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,7,9,88,155,658,754,999,1000,1212,1354,4589};
		int key = 568;
		
		System.out.println("floor "+floor(arr, key));
		System.out.println("ciel "+ciel(arr, key));

	}

}
