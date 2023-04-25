package multithreading;

public class RunnableExample {

    public static void main(String[] args) {

        System.out.println("Runnable thread example : ");
        MyRunnable myRunnable = new MyRunnable();

        Thread myThread = new Thread(myRunnable);

        System.out.println("Before thread start ");
        myThread.start();
        System.out.println("After thread start ");
    }

}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Coming from runnable");
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread : " + Thread.currentThread() + " Iteration i :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
