package map;

import java.util.TreeMap;
import java.util.WeakHashMap;

public class WeakHashMapNullKey {
    public static void main(String[] args) {
        /**
         * In a WeakHashMap.put(null, "Hello world"), when will the entry be removed in #Java?
         * with possible answers of
         * "Won't be added" (35%),
         * "At the next GC" (14%),
         * "A while after the next GC" (14%), and
         * "Never" (37%).
         * The correct answer is the last one, since when the key is null, a private static final object is used instead as a key.
         * Since this object is always reachable, the WeakReference will never be cleared, and thus the entry will remain in the map forever.
         *
         */
        try {
            new WeakHashMap<>().put(null, "Welcome to WeakHashMap");
        } catch (Exception e) {
            System.out.println("Exception occured : " + e.getMessage());
        }
    }
}
