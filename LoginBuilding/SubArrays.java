package LoginBuilding;

public class SubArrays {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,10,11,12,13,14,15,16};

//		for(int k = 1; k < arr.length;k++) {
			for(int i = 0; i < arr.length - 5; i++) {
				for(int j = i; j < i+5; j++) {
					System.out.print(arr[j] + " " );
				}
				System.out.println();
//			}
		}
	}

}
