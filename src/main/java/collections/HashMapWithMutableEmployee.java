package collections;

import experiments.MutableEmployee;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithMutableEmployee {

    public static void main(String[] args) {

        MutableEmployee e1 = new MutableEmployee("Sumeet", 123);
        MutableEmployee e3 = new MutableEmployee("Sumeet", 123);
        Map<MutableEmployee, String> map = new HashMap<>();
        map.put(e1,"A");
        e1.setName("Sameer");
        map.put(e1,"B");

        MutableEmployee e2 = new MutableEmployee("Sameer", 123);

        System.out.println(e1.equals(e2));

        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get(e1));
        System.out.println(map.get(e3));

        e1.setName("Sumeet");

        System.out.println(map.get(e1));

        try{
            float f = 25/0;
        }catch (Error e){

        }catch (Exception e){

        }catch (Throwable t){

        }


    }

}
