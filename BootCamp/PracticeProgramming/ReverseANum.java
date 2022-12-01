package BootCamp.PracticeProgramming;

public class ReverseANum {
    public static void main(String[] args) {
        int n = 36575494;
        int res = 0;

        while(n > 0){
            int x = n % 10;
            res = res * 10 + x;
            n = n/10;
        }
        System.out.println(res);
    }
}
