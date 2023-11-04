package JavaStreams;

import java.util.ArrayList;

public class Streams1 {
    public static void main (String[]args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("ramesh");
        names.add("anil");
        names.add("praveen");
        names.add("arun");
        names.add("akash");
        //there is no life for intermediate operator if there is no terminal operator
        //terminal operator will execute only if internal operator (filter) returns true
        //we can create streams
        //how to use filter in stream API
        Long c = names.stream().filter(s -> s.startsWith("a")).count();
        System.out.println(c);
    }
}
