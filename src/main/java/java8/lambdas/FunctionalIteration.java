package java8.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalIteration {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //external iterators
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //another external iterator
        for (int e : numbers) {
            System.out.println(e);
        }

        // internal iterator with anonymous inner class
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer value) {
                System.out.println(value);
            }
        });

        // Java 8 has type inference only for lambdas
        // integer iterator without anonymous inner class
        numbers.forEach((e) -> System.out.println(e));

        // parenthesis are optional
        numbers.forEach(e -> System.out.println(e));

        //we aren't doing anything with e, we are just accepting and passing it
        numbers.forEach(System.out::println);


    }

}
