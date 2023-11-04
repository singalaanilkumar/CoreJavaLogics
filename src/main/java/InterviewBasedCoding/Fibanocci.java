package InterviewBasedCoding;

/**
 * print Fibanocci  series by swapping variable
 */

public class Fibanocci {
    public static void main(String[] args) {
//0,1, 2 3 5 8 13 21 34 -> 0+1=1 , 1+1= 2 1+2=3 2+3=5 3+5=8 5+8=13 8+13 =21 13+21=34
        int a = 0;
        int b = 1;
        int sum;
        int i = 1;
        while (i < 9) { //still confusing  on logic just do debugging the code
            sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
            i++;


        }
    }
}
