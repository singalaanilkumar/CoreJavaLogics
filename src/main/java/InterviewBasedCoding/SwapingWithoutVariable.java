package InterviewBasedCoding;
/** swap the variable without temp variable */

public class SwapingWithoutVariable {
    public static void main(String[]args)
    {
        int a =30;
        int b =40;
        a= a+b; // 30+40= 70
        b = a-b; // 70-40 = 30
        a= a-b; // 70-30 = 40
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
}
