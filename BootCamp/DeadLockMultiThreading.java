package BootCamp;

class Family implements Runnable {
    String resource1 = "TV";
    String resource2 = "PlayStation";

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("javeed")) {
            javeed();
        } else {
            sharif();
        }
    }

    void javeed() {
        synchronized (resource1) {
            try {
                System.out.println("Javeed got tv");
                Thread.sleep(1000);

                synchronized (resource2) {
                    System.out.println("Javeed got play station");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    void sharif() {
        synchronized (resource1) {
            try {
                System.out.println("sharif got tv");
                Thread.sleep(1000);

                synchronized (resource2) {
                    System.out.println("sharif got play station");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class DeadLockMultiThreading {
    public static void main(String[] args) {
        Family f = new Family();

        // need to create a 2 stack frames

        Thread t1 = new Thread(f);
        Thread t2 = new Thread(f);

        t1.setName("javeed");
        t2.setName("sharif");

        t1.start();
        t2.start();
    }
}
