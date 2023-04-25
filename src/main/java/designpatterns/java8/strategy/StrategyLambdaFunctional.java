package designpatterns.java8.strategy;

import java.util.List;
import java.util.function.Predicate;

public class StrategyLambdaFunctional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(total(numbers, e -> true));      // Get sum of all the numbers
        System.out.println(total(numbers, e -> e % 2 != 0));// Get sum of all odd numbers
        System.out.println(total(numbers, e -> e % 2 == 0));// Get sum of all even numbers
    }

    // Predicate is used to decide the strategy
    private static Integer total(List<Integer> numbers, Predicate<Integer> selector) {
        return numbers.stream()
                .filter(selector)
                .mapToInt(e -> e)
                .sum();
    }
}
