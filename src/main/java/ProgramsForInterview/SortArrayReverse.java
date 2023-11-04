package ProgramsForInterview;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayReverse {
    public static void main(String[] args) {
        Integer[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        Arrays.sort(numbers, Collections.reverseOrder());

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
