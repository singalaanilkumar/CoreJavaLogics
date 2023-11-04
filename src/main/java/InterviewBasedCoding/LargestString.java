package InterviewBasedCoding;

import java.util.Arrays;
import java.util.Comparator;

/** Java program to find longest string */

public class LargestString {
    public static void main(String[] args) {
        //AlternTIVE method
        String str = "I love my Country";
        String longest = Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(longest);
        System.out.println(longest.length());

    }
}
