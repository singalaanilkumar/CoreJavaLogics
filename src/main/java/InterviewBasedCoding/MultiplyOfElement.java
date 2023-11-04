package InterviewBasedCoding;

/** //Print 5 Multiplication table without using Multiply operator */
public class MultiplyOfElement {
    public static void main(String[] args) {
        int result = multiply(5, 10);
        System.out.println(result);
    }

    private static int multiply(int i, int j) {
        //i has to sum itself j times to get result Approach//algorithm
        int k = 1;
        int sum = 0;
        while (k <= j) {
            sum = sum + i;
            k++;
        }
        return sum;
    }
}
