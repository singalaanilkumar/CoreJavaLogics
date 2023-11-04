package ProgramsForInterview;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = true;

// Convert the string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();

// Create a hash set to store the unique characters in the string
        Set<Character> set = new HashSet<>();

// Loop through each character in the string and add it to the set
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }

// Check if the set contains all the alphabets
        if (set.size() != 26) {
            isPangram = false;
        }

// Print the result
        if (isPangram) {
            System.out.println(str + " is a pangram.");
        } else {
            System.out.println(str + " is not a pangram.");
        }
    }
}
