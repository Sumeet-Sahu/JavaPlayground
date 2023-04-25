package map;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfFun {

    public static void main(String[] args) {
        Map<Integer, Long> map = new HashMap<>(1);
        System.out.println("Map : " + map);

        map.computeIfAbsent(-1, key -> {
            System.out.println("Computing value as null");
            return null;
        });
        System.out.println("Map : " + map);

        map.computeIfAbsent(-1, key -> {
            System.out.println("Computing value as 0L");
            return 0L;
        });
        System.out.println("Map : " + map);

        map.computeIfPresent(-1, (k, v) -> {
            System.out.println("computeIfPresent : Computing value as null");
            return null;
        });
        System.out.println("Map : " + map);

        map.put(-1, null);
        System.out.println("Map : " + map);

        map.compute(-1, (k,v) -> null);
        System.out.println("Map : " + map);
    }

}
