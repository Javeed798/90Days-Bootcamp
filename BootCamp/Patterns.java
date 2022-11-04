package BootCamp;

public class Patterns {

    public static void main(String[] args) {
        int n = 7;

        // star pattern
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j<=i;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // reverse star patterm
//        for (int i = 1; i<= n; i++) {
//            for(int j = 1; j <= n-i +1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();


        // print num
//        for (int i = 1; i<=n ;i++) {
//            for (int j = 1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // print chars

        char ch = 'A';
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
