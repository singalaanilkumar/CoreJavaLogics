package InterviewBasedCoding;

/** java program that converts a given string from lowercase to uppercase without using the inbuilt toUpperCase() function */

public class StringToUpper {
        public static void main(String[] args) {
            String str = "hellow how are you";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char)(ch - 'a' + 'A');
                }
                sb.append(ch);
            }
            String upperStr = sb.toString();
            System.out.println(upperStr);
        }
    }