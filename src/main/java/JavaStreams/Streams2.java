package JavaStreams;
import java.util.stream.Stream;

public class Streams2 {
    public static void main(String[] args) {
        long d = Stream.of("ramesh", "anil", "praveen", "arun", "akash").filter(s ->
        {
            s.startsWith("a");
            return true;//terminal operator will execute only if internal operator (filter) returns true
        }).count(); // limit ,count -> terminal operator
        System.out.println(d);
    }
}
