package multithreading;

public class SequentialApp {


    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();
        Runner2 runner2 = new Runner2();

        runner1.startProcessing();
        runner2.startProcessing();
    }

}
