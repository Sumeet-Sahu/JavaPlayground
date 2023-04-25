package map;

import java.util.HashMap;
import java.util.Map;

public class ReplaceRemoveFun {

    public static void main(String[] args) {
        Map<Integer, Long> map = new HashMap<>(1);
        System.out.println("Map : " + map);

        map.put(-1, 0L);
        System.out.println(map.replace(-1, null));

        System.out.println(map.replace(-1, null, null));

        System.out.println(map.remove(-1, null));
        System.out.println(map.remove(-1, null));
    }

}
