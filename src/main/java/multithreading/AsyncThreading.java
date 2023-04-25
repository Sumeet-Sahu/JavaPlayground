package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsyncThreading {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Future<String> completableFuture = AsyncThreadingOperation.calculateAsync();
        System.out.println("Is it done ? : " + completableFuture.isDone());
        System.out.println(completableFuture);
        Thread.sleep(1000);
        System.out.println("After 1 sec ");
        System.out.println("Is it done ? : " + completableFuture.isDone());
        System.out.println(completableFuture);
        String output = completableFuture.get();
        System.out.println(output);

        System.out.println("====================================================================");

        completableFuture = AsyncThreadingOperation.calculateAsyncString();

        while (!completableFuture.isDone()) {
            System.out.println("Is it done ? : " + completableFuture.isDone());
            System.out.println(completableFuture);
            Thread.sleep(1000);
            System.out.println("After 1 sec ");
        }
        output = completableFuture.get();
        System.out.println(output);

        System.out.println("===============================Async Call Parallel=====================================");
        AsyncThreadingOperation.calculateAsyncString();
        System.out.println("Something continued...");

//        System.out.println("===============================Future Vs Completable future time performance=====================================");
//        AsyncThreadingOperation.calculateAsyncStringPerformanceTest();


    }

}
