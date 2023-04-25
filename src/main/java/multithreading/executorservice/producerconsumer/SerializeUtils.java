package multithreading.executorservice.producerconsumer;

import java.io.*;

public class SerializeUtils {

    public static <T> void serializeObject(T objectToSerialize, String path) throws FileNotFoundException {
        try
        {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(objectToSerialize);
            out.close();
            file.close();
            System.out.println("Object has been serialized");

        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public <T> T deserializeObject(String path) throws FileNotFoundException {
        T deserializedObject = null;

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            deserializedObject = (T)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deserializedObject;
    }

}
