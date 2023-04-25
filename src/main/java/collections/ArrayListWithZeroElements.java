package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithZeroElements {

    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>();

        list.add(Long.valueOf(56));
        list.add(Long.valueOf(67));
        System.out.println(Arrays.toString(list.toArray(new Long[0])));
    }

}
