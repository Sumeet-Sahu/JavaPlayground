package multithreading.executorservice.producerconsumer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Producer implements Runnable {

    private final Broker broker;
    private final List<File> listOfFileInFolder;

    public Producer(Broker broker, String sourcePath) throws IOException {
        this.broker = broker;
        this.listOfFileInFolder = Files.walk(Paths.get(sourcePath))
                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .collect(Collectors.toList());
    }

    @Override
    public void run() {
        for (File file : listOfFileInFolder) {
            broker.registerFileToCopy(file);
        }
        broker.keepProducing(false);
    }
}
