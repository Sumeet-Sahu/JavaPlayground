package multithreading;

public class ThreadJoin {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runner1());
        Thread t2 = new Runner2();

        t1.start();
        t2.start();

        // Could be printed even before t1 or t2 starts
        System.out.println("Printed after threads are started...");


        t1.join();
        System.out.println("T1 join called, will be printed once t1 execution is complete");
        t2.join();
        System.out.println("Both t1 and t2 execution complete");

    }

}
