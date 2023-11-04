package InterviewBasedCoding;

/** Java program that takes a string as input, converts the first character of each word in the string to uppercase, and then returns the modified string */
public class UppercaseFirstCharacter {
    public static void main(String[] args) {
        String str = "hi hello how are you";
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            String first = word.substring(0, 1).toUpperCase();
            String rest = word.substring(1);
            result += first + rest + " ";
        }

        System.out.println(result.trim());
    }
}
