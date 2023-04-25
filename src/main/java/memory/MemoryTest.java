package memory;

import java.util.ArrayList;
import java.util.List;

public class MemoryTest {

    public static void main(String[] args) {
        List<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 20000; i++) {
            try{
                System.out.println(i);
                list.add(new ArrayList<>(20000));
            }catch (OutOfMemoryError e){
                System.out.println(i);
            }
        }
    }
}
