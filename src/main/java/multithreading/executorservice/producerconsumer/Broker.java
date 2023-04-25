package multithreading.executorservice.producerconsumer;

import java.io.File;
import java.io.Serializable;
import java.util.concurrent.ArrayBlockingQueue;

public class Broker implements Serializable {

    public ArrayBlockingQueue<File> queue;

    private boolean keepProducing = true;

    public Broker(Integer capacity) {
        this.queue = new ArrayBlockingQueue<>(capacity);
    }

    public void registerFileToCopy(File file) {
        try {
            queue.put(file);
        } catch (InterruptedException e) {
            System.out.println("QUEUE FULL");
        }
    }

    public File getFileForCopyOperation() throws InterruptedException {
        return queue.poll();
    }

    public void keepProducing(boolean value) {
        keepProducing = value;
    }

    public boolean isProducing() {
        return keepProducing;
    }


}
