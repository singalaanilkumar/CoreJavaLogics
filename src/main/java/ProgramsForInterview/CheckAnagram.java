package ProgramsForInterview;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = true;

// Convert the strings to lowercase to make the comparison case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

// Check if the strings have the same length
        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
// Convert the strings to character arrays
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

// Sort the character arrays
            Arrays.sort(ch1);
            Arrays.sort(ch2);

// Compare the sorted arrays
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    isAnagram = false;
                    break;
                }
            }
        }

// Print the result
        if (isAnagram) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}