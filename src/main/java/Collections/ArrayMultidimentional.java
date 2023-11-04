package Collections;

public class ArrayMultidimentional {
	public static void main(String[] args) {
	//a[row][column]
	int a[][] = new int[2][3]; //2 is row, 3 is column
	a[0][0]=2;
	a[0][1]=4;
	a[0][2]=5;
	a[1][0]=3;
	a[1][1]=4;
	a[1][2]=7;
	//System.out.println(a[1][0]); 
	
	/* int b[][]= {{2,0,5},{3,0,7},{5,2,1}}; // {{0},{1},{2}}
	System.out.println(b[1][1]); // printed 4 i guess */
   
	for (int i=0;i<2;i++) //i = 0,1
	{
		for(int j=0;j<3;j++) // j=0,1,2 
		{
			System.out.print(a[i][j]);  // a[0][0],a[0][1],a[0][2],a[1][0],a[1][1],a[1][2]
			System.out.print(",");
			
		}
		System.out.println(""); //blank
	}
	
	}
}
/* out put:- 245
             347 */