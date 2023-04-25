package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapWNull {

    public static void main(String[] args) {

        /**
         * What does new TreeMap().put(null, null) produce?
         *  with possible answers of
         *  "No output" (15%),
         *  NullPointerException (61%) and
         *  "Either, depending on ..." (24%).
         *  The correct answer is the last, because it depends on the Java version.
         *  Versions 1.2 through 1.6 they accepted the first key to be null, and would only throw a NullPointerException on subsequent entries.
         *  This was made more consistent in Java 1.7 to always throw a NullPointerException unless the TreeMap was created with a Comparator that could cope with null keys.
         *  See Bug 5045147.
         */
        try {
            new TreeMap().put(null, null);
        } catch (Exception e) {
            System.out.println("Exception occured : " + e.getMessage());
        }
    }

}
