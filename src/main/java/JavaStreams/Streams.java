package JavaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

//streams  are introducted  in java8.
public class Streams {

    public static void main (String[]args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("ramesh");
        names.add("anil");
        names.add("praveen");
        names.add("arun");
        names.add("akash");
        int count =0;
        for (int i=0;i< names.size();i++)
        {
            String actual = names.get(i);
            if(actual.startsWith("a"))
            {
                count++;
            }
        }
        System.out.println(count);
    }


}
