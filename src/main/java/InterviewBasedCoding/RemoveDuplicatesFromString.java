package InterviewBasedCoding;

import java.util.HashSet;
/** Java program that removes duplicates from a string using a HashSet */

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String inputString = "Hii Howw arerr yyou";
        String outputString = removeDuplicates(inputString);
        System.out.println(outputString); // prints "Hi How are you"
    }

    public static String removeDuplicates(String str) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
}
