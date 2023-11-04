package Collections;
/* Syntax to Declare Multidimensional Array in Java:-
dataType[][] arrayRefVar; (or)  
dataType [][]arrayRefVar; (or)  
dataType arrayRefVar[][]; (or)  
dataType []arrayRefVar[]; ex:-int[][] a; , int [][]a;  
Indirect Method of Declaration:

Declaration – Syntax:
data_type[][] array_name = new data_type[x][y];
For example: int[][] arr = new int[10][20];
        
Initialization – Syntax:
array_name[row_index][column_index] = value;
For example: arr[0][0] = 1; */
        
public class MultidimensionalArray {

	public static void main(String[] args) {
		/*int[][] arr = new int[10][20];
		arr[0][0] = 10;
		arr[0][1] = 20;
        System.out.println("arr[0][0] = " + arr[0][0]);*/
        
        /*int[][] arr = { { 1, 2 }, { 3, 4 } };
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);*/
        
        /*int[][] arr = { { 1, 2 }, { 3, 4 } };
        System.out.println("arr[0][0] = " + arr[0][0]);
        System.out.println("arr[0][1] = " + arr[0][1]);
        System.out.println("arr[1][0] = " + arr[1][0]);
        System.out.println("arr[1][1] = " + arr[1][1]);*/
		
		/*int[][] arr = { { 1, 2 }, { 3, 4 } };  
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/
		
		int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };  
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int z = 0; z < 2; z++)
                    System.out.println("arr[" + i
                                       + "]["
                                       + j + "]["
                                       + z + "] = "
                                       + arr[i][j][z]);
        
	}
}
