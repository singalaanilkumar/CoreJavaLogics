package InterviewBasedCoding;

/**
 * Create a Method which accepts Array and returns sum of all the elements in array
 */
public class SumOfElement {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
       int addingResult= sum(a);
        System.out.println(addingResult);
    }

    private static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
}
