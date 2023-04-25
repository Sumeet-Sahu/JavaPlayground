package cloning;

import java.util.ArrayList;
import java.util.List;

public class ListDeepCloning {

    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.add(4);

        List<Integer> copy = new ArrayList<>(temp);

        if(temp == copy) {
            System.out.println("SAME");
        } else {
            System.out.println("NOT SAME");

            System.out.println(temp.get(0) == copy.get(0));

        }

    }

}
