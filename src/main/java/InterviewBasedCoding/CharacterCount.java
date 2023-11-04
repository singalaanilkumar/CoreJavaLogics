package InterviewBasedCoding;

/** Java program that finds the number of characters in the string "Hi how are you": */
public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hi how are you";
        int count = 0;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Number of characters in the string: " + count);
    }
}
