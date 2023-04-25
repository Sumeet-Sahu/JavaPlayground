package system;

public class ProcessorInformation {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int availableProcessors = runtime.availableProcessors();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long totalMemory = runtime.totalMemory();

        System.out.println("Number of available processors: " + availableProcessors);
        System.out.println("Maximum memory: " + maxMemory / 1024 / 1024 + " MB");
        System.out.println("Free memory: " + freeMemory / 1024 / 1024 + " MB");
        System.out.println("Total memory: " + totalMemory / 1024 / 1024 + " MB");
    }
}
