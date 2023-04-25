package multithreading;

public class Runner2 extends Thread{

    public void startProcessing() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner 2 :=> " + i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Runner 2 :=> " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
