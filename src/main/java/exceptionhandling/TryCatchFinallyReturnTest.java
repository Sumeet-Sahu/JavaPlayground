package exceptionhandling;

import java.util.Stack;

public class TryCatchFinallyReturnTest {


    public static void main(String[] args) {
        System.out.println(tryit(25));
        Stack<String> myStack = new Stack<>();
        myStack.push("Gagan");

    }

    private static int tryit(int i) {
        try {
            int x = 25 / i;
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }

    }

}
