package Collections;

public class ArrayMultiTasks {
	/* output task:- 9861
                     2354
                     7654

	public static void main(String[] args) {
		int a[][]= {{9,8,6,1},{2,3,5,4},{7,6,5,4}}; // {{0},{1},{2}}
		for (int i=0;i<3;i++) //i = 0,1,2
		{
			for(int j=0;j<4;j++) // j=0,1,2,3
			{
				System.out.print(a[i][j]);  
				
				
			}
			System.out.println(""); //blank
		} 
	}
}*/
/* output task:- 984764
                 235484
                 765474
*/
	public static void main(String[] args) {
		int a[][]= {{9,8,4,7,6,4},{2,3,5,4,8,4},{7,6,5,4,7,4}}; //0,1,2 rows " 0,1,2,3,4,5 columns
		//note:- for-loop have no semicolon ;
		for(int i=0; i<3;i++) // i is rows i= 0,1,2
		{
			for(int j=0;j<6;j++)// j is column j=0,1,2,3,4,5
			{
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}
}