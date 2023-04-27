package designpatterns;

import java.util.ArrayList;
import java.util.List;

public class IteratorUsingLambdaAndStreams {
    public static void main(String[] args) {
        List<String> names = List.of("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

        List result1 = new ArrayList<String>();

        for(String name: names) {
            if (name.length() == 4)
                result1.add(name.toUpperCase());
        }

        System.out.println(result1);

        List result2 = new ArrayList<String>();

        names.stream()
                .filter(name -> name.length() == 4)
                .map(String::toUpperCase)
                .forEach(name -> result2.add(name));  // Bad thing to do; modification in stream pipeline.
        // Anti-pattern : The functional pipeline is *not* pure. We are doing shared mutability

        System.out.println(result2);


    }
}
