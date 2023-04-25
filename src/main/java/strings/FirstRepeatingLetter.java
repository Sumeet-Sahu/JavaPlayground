package strings;

public class FirstRepeatingLetter {

    public static void main(String[] args) {
        method(args[0]);
    }

    public static String method(String str) {
        String result = "";

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length-1; i++) {
            if(chars[i] == chars[i+1])
                return new String() + chars[i];
        }
        return result;
    }

}
