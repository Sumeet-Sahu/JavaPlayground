package multithreading;

public class MultiThreadedApp {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread1");
        MyThread t2 = new MyThread("Thread2");

        t1.start();
        t2.start();

    }

}
