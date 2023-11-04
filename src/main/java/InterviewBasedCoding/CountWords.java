package InterviewBasedCoding;
/** Here's a Java program that will find the number of words in the string "Hi how are you": */

public class CountWords {
    public static void main(String[] args) {
        String str = "Hi how are you";
        int count = 0;

        // loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // check if the current character is a space
            if (str.charAt(i) == ' ') {
                // if it is, increment the word count
                count++;
            }
        }

        // add one to the word count to include the last word
        count++;

        System.out.println("The number of words in the string is: " + count);
    }
}
