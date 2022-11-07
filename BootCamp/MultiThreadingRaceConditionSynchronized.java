package BootCamp;

class Test4 implements Runnable {
    synchronized public void run() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        try {
            System.out.println(name + " Accessed the printer");
            Thread.sleep(1000);
            System.out.println(name + " is using the printer");
            Thread.sleep(1000);
            System.out.println(name + " finished the printer");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class MultiThreadingRaceConditionSynchronized {
    public static void main(String[] args) {
        Test4 t = new Test4();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);

        t1.setName("a");
        t2.setName("b");
        t3.setName("c");
        t1.start();
        t2.start();
        t3.start();

    }
}
