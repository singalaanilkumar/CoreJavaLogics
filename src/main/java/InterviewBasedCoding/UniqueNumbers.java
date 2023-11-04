package InterviewBasedCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/** eliminate the duplicate number of array and convert ascending order to with unique number as well print 3rd index value*/
public class UniqueNumbers {
    public static void main (String[]args)
    {
        List<Integer> values = Arrays.asList(3,2,1,2,4,7,3,9,8,7,9,8);
        List<Integer> index=values.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(index); //  printed unique number with ascending order/
        System.out.println(index.get(2)); // printed 3rd index
    }
}
