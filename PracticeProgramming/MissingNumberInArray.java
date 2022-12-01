package BootCamp.PracticeProgramming;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {1,2,3,4,5,6,8,9,10,11};
        int n = 10;
        int totalSum =(n+1)*(n+2)/2;

        for (int i = 0; i<arr.length;i++){
            sum = sum + arr[i];
        }

        int missingNum = totalSum - sum;
        System.out.println(missingNum);
    }
}
