package Strings;
/** When to use == and equals() methods to compare Strings */
public class EqualsDifference {
    public static void main(String[]args)
    {
        String a ="anil"; // string literal - mutable
        String b= "anil";
        String s = new String("anil");
        String s1 = new String("anil Kumar");
        System.out.println(a.equals(b)); // returned true because it's check passing value is same r not.
        System.out.println(a==b); // returned true because object creation same approach
        System.out.println(a.equals(s)); // returned true because it's check passing value is same r not.
        System.out.println(a==s); // returned false because object creation approach is different
        System.out.println(s==s1); // returned false because object creation approach is same but reference is different.
    }
}
