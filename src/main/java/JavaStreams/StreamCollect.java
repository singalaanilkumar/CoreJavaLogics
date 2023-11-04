package JavaStreams;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

    public static void main (String[]args)
    {
       List<String> is= Stream.of("ram","bhim","charan","chiru").filter(s->s.endsWith("n")).map(s->s.toUpperCase()).
                collect(Collectors.toList());
       // collect(Collectors.toList()); ->  it is used to print index  in list
       //print frist index name
       System.out.println(is.get(0));

    }
}
