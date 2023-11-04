package InterviewBasedCoding;

import java.util.ArrayList;
/** print the count of string which is startwith "a"*/
public class StringCount {
    public static void main (String[]args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("ramesh");
        names.add("anil");
        names.add("praveen");
        names.add("arun");
        names.add("akash");
        Long c = names.stream().filter(s -> s.startsWith("a")).count();
        System.out.println(c);
    }
}
