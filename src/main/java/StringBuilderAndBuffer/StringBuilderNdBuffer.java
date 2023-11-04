package StringBuilderAndBuffer;

/** Importance of String Builder and String Buffer classes and their Differences */

public class StringBuilderNdBuffer {
    public static void main(String[] args) {
//StringBuffer and StringBuilder -Mutable
        StringBuffer sb = new StringBuffer("hello");
        sb.append("world");
        System.out.println(sb);

        sb.insert(2, "She");//heShelloworld
        System.out.println(sb);

        sb.replace(5, 7, "aa");//heSheaaoworld
        System.out.println(sb);

        sb.deleteCharAt(12);//heSheasoworl
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        StringBuilder shb = new StringBuilder("hello");
        //StringBuilder is not thread safe. It is non Synchronized, It is faster -> not's supports parallel.
    }
}
