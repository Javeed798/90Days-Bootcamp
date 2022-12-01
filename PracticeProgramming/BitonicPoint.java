package BootCamp.PracticeProgramming;

public class BitonicPoint {
	public static int ascendingBinarySearch(int[] arr,int key,int range) {
		int low = 0;
		int high = range;
		while(low <= high) {
			int mid = (low + high) /2;
			if(key == arr[mid]) {
				return mid;
			}
			else if(key < arr[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
	}
	
	public static int descendingBinarySearch(int[] arr,int key,int range) {
		int low = range;
		int high = arr.length-1;
		while(low <= high) {
			int mid = (low + high) /2;
			if(key == arr[mid]) {
				return mid;
			}
			else if(key < arr[mid]) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}
	
	public static int bitonicPoint(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		int mid = 0;
		while(left <= right) {
			mid = (left+right)/2;
			if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
				return mid;
			}
			else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
				left = mid;
			}
			else {
				right = mid;
			}
		}
		return -1;
	}

	public static int searchBitonic(int[] arr, int key, int bIndex) {
		if(key == arr[bIndex]) {
			return bIndex;
		}
		if(key > arr[bIndex]) {
			return -1;
		}
		
		int res1 = ascendingBinarySearch(arr, key, bIndex);
		if(res1 != -1) {
			return res1;
		}
		
		int res2 = descendingBinarySearch(arr, key, bIndex);
		if(res2 != -1) {
			return res2;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,7,8,9,10,7,6,3,2,1};
		int a = bitonicPoint(arr);
		System.out.println(searchBitonic(arr, 10, a));
	}

}
