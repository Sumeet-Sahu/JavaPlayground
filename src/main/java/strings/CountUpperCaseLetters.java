package strings;

public class CountUpperCaseLetters {

    public static void main(String[] args) {
        String str = "This is string";

        char[] chars = str.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            if(Character.isUpperCase(chars[i])) {
                result++;
            }
        }
        System.out.println(result);
    }

}
