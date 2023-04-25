package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String str = "pwwkew";

        System.out.println("Length : " + lengthOfLongestSubstring(str));
    }

    private static int lengthOfLongestSubstring(String s) {

        if(s.length() == 0) {
            return 0;
        }

        char[] chars = s.toCharArray();

        int maxLength = 1;
        int length = 0;
        for(int i=0; i<chars.length-1; i++) {
            length = 0;
            Set set = new HashSet();
            for(int j= i; j<chars.length; j++) {
                if(set.add(chars[j])) {
                    length++;
                } else {
                    if(maxLength < length) {
                        maxLength = length;
                    }
                    length = 0;
                    set = new HashSet();
                    set.add(chars[j]);
                }
                if(maxLength < length) {
                    maxLength = length;
                }
            }
        }
        return maxLength;
    }

}
