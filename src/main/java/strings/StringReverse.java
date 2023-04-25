package strings;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(reverseUsingStringBuilderReverseApi("Hello"));
        System.out.println(reverseUsingStringBuilderManually("Hello"));
        System.out.println(reverseUsingRecursion("Hello"));
        System.out.println(reverseUsingRecursion2("Hello"));
    }

    private static String reverseUsingStringBuilderReverseApi(String stringToReverse) {
        StringBuilder sb = new StringBuilder(stringToReverse);
        return sb.reverse().toString();
    }

    private static String reverseUsingStringBuilderManually(String stringToReverse) {
        StringBuilder sb = new StringBuilder();
        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            sb.append(stringToReverse.charAt(i));
        }
        return sb.toString();
    }

    private static String reverseUsingRecursion(String stringToReverse) {
        if (stringToReverse.length() == 1) {
            return stringToReverse;
        }
        return stringToReverse.charAt(stringToReverse.length() - 1) + reverseUsingRecursion(stringToReverse.substring(0, stringToReverse.length() - 1));
    }

    private static String reverseUsingRecursion2(String stringToReverse) {
        if (stringToReverse.length() == 1) {
            return stringToReverse;
        }
        return reverseUsingRecursion(stringToReverse.substring(1)) + stringToReverse.charAt(0);
    }
}
