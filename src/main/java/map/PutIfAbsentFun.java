package map;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsentFun {
    public static void main(String[] args) {
        Map<Integer, Long> map = new HashMap<>(1);
        map.put(-1, null);
        System.out.println("Map : " + map);

        if(!map.containsKey(-1)) {
            System.out.println("Map doesn't contain -1");
            Long putReturn = map.put(-1, 0L);
            System.out.println("map.put(-1, 0L) returned : " + putReturn);
            System.out.println("Map : " + map);
        }

        if(map.get(-1) == null) {
            System.out.println("map.get(-1) = " + map.get(-1));
            Long putReturn = map.put(-1, 0L);
            System.out.println("map.put(-1, 0L) returned : " + putReturn);
            System.out.println("Map : " + map);
        }
    }
}
