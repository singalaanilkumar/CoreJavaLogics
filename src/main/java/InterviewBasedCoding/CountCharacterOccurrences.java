package InterviewBasedCoding;

import java.util.HashMap;
import java.util.Map;
/** java program that finds the maximum occurrences of each character in the given string */

public class CountCharacterOccurrences {
    public static void main(String[] args) {
        String str = "Hello,*&World!";
        Map<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
