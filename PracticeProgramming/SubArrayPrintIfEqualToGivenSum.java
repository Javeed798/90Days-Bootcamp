package BootCamp.PracticeProgramming;

public class SubArrayPrintIfEqualToGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i = 0; i< arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}

		int[] arr = { 5, 1, 2, 4, 9, 3, 1, 3, 3 };

		subArraySum(arr, 3, 7);

	}

	public static void subArraySum(int[] arr, int k, int x) {
		for (int i = 0; i < arr.length - k; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum = sum + arr[j];
			}
			if (sum == x) {
				for (int j = i; j < i + k; j++) {
					System.out.print(arr[j] + " ");
					;
				}
				System.out.println();
			}
		}
	}

}
