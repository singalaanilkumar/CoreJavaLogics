package Collections;

/*o/p:- 98754
      1234
      12765
      */
public class Arraylogic {
	public static void main(String[] args) {
		int a[][]={{9,8,7,5,4},{1,2,3,4,9},{1,2,6,7,5}};//r = 0,1,2 c=5,4,5
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
		
	}

}
