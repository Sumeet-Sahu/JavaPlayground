package logical;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedCharacterOccuringFirstInString {

    public static void main(String[] args) {
        String base = "Print earliest repeating character";
        System.out.println(printStartmostRepeatingCharacter(base));
    }

    private static String printStartmostRepeatingCharacter(String base) {
        Map<Character, Integer> sortedFrequencyMap = new LinkedHashMap<>();
        for (char c : base.toCharArray()) {
            int oldValue = sortedFrequencyMap.get(c) != null ? sortedFrequencyMap.get(c) : 0;
            sortedFrequencyMap.put(c, oldValue + 1);
        }
        Character repeatedCharacter = 0;
        for (Character c : sortedFrequencyMap.keySet()) {
            if (sortedFrequencyMap.get(c) > 1)
                return c.toString();
        }
        return repeatedCharacter.toString();
    }
}
