package InterviewBasedCoding;

public class LargestStringNdCountCharacter {
    public static void main(String[] args) {
        String s = "zensar technologies ltd";

        // Split the string into words
        String[] words = s.split(" ");

        // Initialize variables to keep track of the largest word and its length
        String largestWord = "";
        int largestLength = 0;

        // Iterate over each word
        for (String word : words) {
            // Count the characters in the word
            int length = word.length();

            // Check if the current word is larger than the largest word found so far
            if (length > largestLength) {
                largestWord = word;
                largestLength = length;
            }
        }

        System.out.println("Largest word: " + largestWord);
       /* System.out.println("Character count:");

        // Count each character in the largest word
        int[] charCount = new int[256];  // Assuming ASCII characters
        for (char c : largestWord.toCharArray()) {
            charCount[c]++;
        }

        // Print the character count
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }*/
    }
}
