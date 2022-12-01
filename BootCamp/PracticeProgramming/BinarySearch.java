package BootCamp.PracticeProgramming;

public class BinarySearch {

	public static int binarySearch(int[] arr,int key) {
		int low = 0;
		int high = arr.length-1;
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

	public static void main(String[] args) {
		int[] arr = {1,6,7,8,9,11,13,15,19,22,25,28,32,33,35,36,36,40};
	
		System.out.println(binarySearch(arr,28));
		
	}
	

}
