package multithreading.executorservice.producerconsumer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class FileTransferUsingPCExecutor {

    public static void main(String[] args) throws IOException {

        String sourcePath = "/Users/sumeet.sahu/Desktop/Illumiate2020";

        String destinationPath = "/Users/sumeet.sahu/Desktop/Illumiate2021";

        Broker broker = new Broker(5);

        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        threadPool.execute(new Producer(broker, sourcePath));
        threadPool.execute(new Consumer(broker, destinationPath));
        threadPool.execute(new Consumer(broker, destinationPath));

        threadPool.shutdown();
    }

    private static void mytraditionalapproach() throws Exception {
        String sourcePath = "/Users/sumeet.sahu/Desktop/Illumiate2020";
        String destinationPath = "/Users/sumeet.sahu/Desktop/Illumiate2021";

        File sourceDir = new File(sourcePath);
        File[] myfileslist = sourceDir.listFiles();

        List<File> files = Files.walk(Paths.get(sourcePath))
                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .collect(Collectors.toList());

        for(File myFile: myfileslist){
            Files.copy(myFile.toPath(), new File(destinationPath).toPath().resolve(myFile.getName()));
        }
    }

}
