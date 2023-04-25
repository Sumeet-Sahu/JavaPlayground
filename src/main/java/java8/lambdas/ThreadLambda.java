package java8.lambdas;

public class ThreadLambda {

    public static void main(String[] args) {

        // Old Way
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In other thread...");
            }
        });
        th.start();

        // Lambda Way
        Thread th2 = new Thread(() -> System.out.println("Inside thread lambda"));
        th2.start();

        System.out.println(" In main ...");
    }

}
