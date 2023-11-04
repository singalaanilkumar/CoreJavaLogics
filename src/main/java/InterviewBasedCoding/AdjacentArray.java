package InterviewBasedCoding;

public class AdjacentArray {
    public static void main(String[] args) {
        /** Max difference between any adjacent index in array */
        int[] a = {1, 4, 8, 15, 17}; //4-1= 3, 8-4= 4, 15-8= 7, 17-15= 2 -> 3,4,7,2
        int diff = 0;
        for (int i = 0; i < a.length -1; i++) {
            if (a[i + 1] - a[i] > diff) //4-1 > 0
            {
                diff = a[i + 1] - a[i] ;
            }
        }
        System.out.println(diff);

    }
}
