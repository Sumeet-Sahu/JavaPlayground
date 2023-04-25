package logical;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        int n = sc.nextInt();

        System.out.println(fibonacciWithoutRecursion(n));
        System.out.println(fibonacciWithRecursion(n));
//        printFibonacciSeriesWithoutRecursion(n);
        printFibonacciSeriesWithRecursion(n);
//        printFibonacciSequenceWithRecursionCaller(n); //47 is the limit
    }

    private static int fibonacciWithRecursion(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return fibonacciWithRecursion(n - 2) + fibonacciWithRecursion(n - 1);
    }


    private static void printFibonacciSequenceWithRecursionCaller(int n) {
        System.out.println(0);
        System.out.println(1);
        printFibonacciSequenceWithRecursion(0, 1, n - 2);
    }

    private static void printFibonacciSequenceWithRecursion(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(a + b);
        printFibonacciSequenceWithRecursion(b, a + b, n - 1);
    }

    private static int fibonacciWithoutRecursion(int n) {
        int n1 = 0, n2 = 1;
        int sum = 0;
        if (n == 1)
            return n1;
        if (n == 2)
            return n2;
        for (int i = 3; i <= n; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return sum;
    }

    private static int[] series = null;

    private static int printFibonacciSeriesWithRecursion(int n) {
        if (series == null) {
            series = new int[n];
            Arrays.fill(series, -1);
        }
        if (n == 1) {
            if (series[0] == -1) {
                series[0] = 0;
                System.out.println(series[0]);
            }
            return series[0];
        }
        if (n == 2) {
            if (series[1] == -1) {
                printFibonacciSeriesWithRecursion(1);
                series[1] = 1;
                System.out.println(series[1]);
            }
            return series[1];
        }
        if (series[n - 1] == -1) {
            series[n - 1] = printFibonacciSeriesWithRecursion(n - 1) + printFibonacciSeriesWithRecursion(n - 2);
            System.out.println(series[n - 1]);
        }
        return series[n - 1];
    }

    private static void printFibonacciSeriesWithoutRecursion(int n) {
        int n1 = 0, n2 = 1;
        int sum;
        if (n == 1) {
            System.out.println(n1);
            return;
        }
        if (n == 2) {
            System.out.println(n2);
            return;
        }
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 3; i <= n; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.println(sum);
        }
    }
}
