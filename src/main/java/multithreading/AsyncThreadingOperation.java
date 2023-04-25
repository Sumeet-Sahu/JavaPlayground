package multithreading;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class AsyncThreadingOperation {

    static Supplier<String> supplier = () -> {
        sleep(100);
        System.out.println("I am called");
        sleep(1000);
        return "Hello";
    };

    private static void sleep(int milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            System.out.println("Supplier interrupted...");
        }
    }

    private static ExecutorService executorService = Executors.newFixedThreadPool(5);

    public static Future<String> calculateAsync() {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        completableFuture.completeAsync(supplier);
        return completableFuture;
    }

    public static Future<String> calculateAsyncString() {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(supplier, executorService);
        CompletableFuture<String> future = completableFuture.thenApply(s -> s + " World");
        future.exceptionally(s -> s + "Exception");
        return future;
    }

    public static Future<String> calculateAsyncStringPerformanceTest() throws ExecutionException, InterruptedException {

        long before = System.currentTimeMillis();
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(supplier, executorService);
        completableFuture.get();
        long after = System.currentTimeMillis();
        long diff1 = after - before;

        before = System.currentTimeMillis();
        Future<String> future = executorService.submit(() -> supplier.get());
        future.get();
        after = System.currentTimeMillis();
        long diff2 = after - before;

        System.out.println("CompletableFuture : " + diff1);
        System.out.println("           Future : " + diff2);
        return null;
    }


}
