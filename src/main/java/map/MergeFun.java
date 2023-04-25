package map;

import java.util.HashMap;
import java.util.Map;

public class MergeFun {

    public static void main(String[] args) {
        Map<Integer, Long> map = new HashMap<>(1);
        System.out.println("Map : " + map);

        map.put(-1, null);
        System.out.println("Map : " + map);

        map.merge(-1, 1L, (v1, v2) -> 2L);
        System.out.println("Map : " + map);

        map.merge(-1, 1L, (v1, v2) -> 2L);
        System.out.println("Map : " + map);

        map.merge(-1, 1L, (v1, v2) -> null);
        System.out.println("Map : " + map);
    }

}
