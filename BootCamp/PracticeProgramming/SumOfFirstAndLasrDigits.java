package BootCamp.PracticeProgramming;

public class SumOfFirstAndLasrDigits {
    public static void main(String[] args) {
        int n = 3657;
        int last = n % 10;

        while(n > 9){
            n = n / 10;
        }
        System.out.println(n + last);
    }
}
