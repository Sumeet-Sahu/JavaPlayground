package multithreading;

public class Runner1 implements Runnable{

    public void startProcessing() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner 1 :=> " + i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner 1 :=> " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
