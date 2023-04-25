package multithreading.executorservice.producerconsumer;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;

public class Consumer implements Runnable {

    private final Broker broker;
    private final String destination;

    public Consumer(Broker broker, String destination) {
        this.broker = broker;
        this.destination = destination;
    }

    @Override
    public void run() {
        try {
            File fileToCopy = broker.getFileForCopyOperation();

            while (broker.isProducing() || fileToCopy != null) {
                try {
                    Files.copy(fileToCopy.toPath(), new File(destination).toPath().resolve(fileToCopy.getName()));
                } catch (FileAlreadyExistsException e) {

                } catch (IOException e) {
                    e.printStackTrace();
                }
                fileToCopy = broker.getFileForCopyOperation();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
