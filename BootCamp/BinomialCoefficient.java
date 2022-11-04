package BootCamp;

public class BinomialCoefficient {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i<=n; i++) {
             f = f * i;
        }
        return f;
    }


//    ncr = n!/ r! * (n-r)!
    public static int binomialCoeff(int n, int r) {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial((n-r));
        int res = a / (b * c);
        return res;
    }

    public static boolean isPrimeDirect(int n) {
        //corner cases.
        if(n==2) {
            return true;
        }
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
       for (int i = 2; i <= n; i++) {
           if (isPrime(i)){
               System.out.print(i + " ");
           }
       }
        System.out.println();
    }

    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(binomialCoeff(5,2));
//        System.out.println(isPrime(12));
          primesInRange(200);
    }
}
