package BootCamp;

class Daemon1 extends Thread  {
    public void run() {
        System.out.println("User method Started");
        for (int i = 1; i<= 5; i++) {
            System.out.println("User method executing");
        }
        System.out.println("User method Ended");
    }
}

class Daemon2 extends Thread  {
    public void run() {
        System.out.println("Daemon method Started");
        for (; ;) {
            System.out.println("Daemon method executing");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        System.out.println("User method Ended");
    }
}

public class MultiThreadingSetDaemon {
    public static void main(String[] args) {
        Daemon1 d1 = new Daemon1();
        Daemon2 d2 = new Daemon2();

        d1.start();

        d2.setDaemon(true);
        d2.start();
    }
}
