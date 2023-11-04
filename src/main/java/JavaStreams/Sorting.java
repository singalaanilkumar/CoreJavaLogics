package JavaStreams;

import java.util.stream.Stream;

public class Sorting {


    // sorting in array:- using sorting it helps go print Array elements in ascending order
    public static void main (String[]args)
    {
        // print names which have  frist letter  as "a"  with uppercase and sorted
        Stream.of("anil","aruna","rama","youra","kumar").filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    }

}
