package designpatterns.decorator;

import java.util.function.Function;

public class Decorator {


    public static void main(String[] args) {
        Function<Integer, Integer> inc = e -> e + 1;
        printIt(5, "incremented", inc);
        printIt(10, "incremented", inc);

        Function<Integer, Integer> doubled = e -> e * 2;
        printIt(5, "doubled", doubled);
        printIt(10, "doubled", doubled);

        Function<Integer, Integer> incAndDoubled = e -> (e + 1) * 2; // No friends (Incorrect way)
        printIt(5, "incremented and doubled", incAndDoubled);
        printIt(10, "incremented and doubled", incAndDoubled);

        // Better way to do decoration
        printIt(5, "incremented and doubled", inc.andThen(doubled));
    }

    private static void printIt(int number, String message, Function<Integer, Integer> function) {
        System.out.println(number + " " + message + " : " + function.apply(number));
    }


}
