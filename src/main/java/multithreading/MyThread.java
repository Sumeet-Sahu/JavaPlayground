/**
 *
 */
package multithreading;

/**
 * @author Sumeet
 *
 */
public class MyThread extends Thread {

    private final String name;

    MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " :=> " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
