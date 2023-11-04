package InterviewBasedCoding;

import java.util.stream.Stream;

public class SortWithFilterCharacter {
    public static void main (String[]args)
    {
        Stream.of("anil","aruna","rama","youra","kumar").filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    }
}
