package BootCamp.PracticeProgramming;

public class UniqueElements {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,4,23};
        int count = 1;
        int uniqueCount = 0;
        for (int i = 0; i<arr.length-1;i++){
            if (arr[i] == arr[i+1]){
                count++;
            } else{
                if (count == 1){
//                    System.out.println(arr[i] + " - " + count);
                    uniqueCount++;
                }
                count = 1;
            }
        }
        if (count == 1){
            uniqueCount++;
        }
        System.out.println(uniqueCount);

    }
}
