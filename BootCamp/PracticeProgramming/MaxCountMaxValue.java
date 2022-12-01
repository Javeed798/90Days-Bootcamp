package BootCamp.PracticeProgramming;

public class MaxCountMaxValue {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3,3,3,3,3,3,3,4,5,5,5,5,5,6};
        int count = 0;
        int maxCount = 0;
        int value = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]){
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    value = arr[i];
                }
            count = 1;
            }
        }
        System.out.println("count "+maxCount);
        System.out.println("value "+value);
    }
}
