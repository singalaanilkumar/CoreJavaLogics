package Collections;

public class CombinedTwoArrays {
        public static void main(String[] args) {
            int[] array1 = {1, 2, 3};
            int[] array2 = {4, 5, 6 , 9 , 10};

            // Calculate the length of the result array
            int totalLength = array1.length + array2.length;



            // Create a new array to store the merged elements
            int[] resultArray = new int[totalLength];



            // Copy elements from array1 to the resultArray
            for (int i = 0; i < array1.length; i++) {
                resultArray[i] = array1[i];
            }
         

            // Copy elements from array2 to the resultArray
            for (int i = 0; i < array2.length; i++) {
                resultArray[array1.length + i] = array2[i];
            }

            // Print the merged array
            for (int element : resultArray) {
                System.out.print(element + " ");
            }
        }
    }

