package Collections;

/*2  4  5

3  4  7

1  2  9*/
//print minimum and Maximum number from the array
public class ArrayInterviewMinMaxnumber {
	public static void main(String[] args) {
			int abc[][]={{2,4,5},{3,2,10},{1,2,0}};// r=3 , c=3
			int min=abc[0][0]; //min=2
			int mincoloumn = 0;

           
			for(int i=0;i<3;i++) // i=0,1,2
			{
			for(int j=0;j<3;j++) //j=0,1,2
			{
			if(abc[i][j]<min)//2<2 false ,4<2 false ..... 1<2 true 1 is toted in min after , o<1 true 0 stored in min
			{
			min=abc[i][j]; //abc[2][2] i=2,j=2 i mean i is row nd j is coloum -> min=0
			mincoloumn=j; // mincoloumn=2
			}
			}
			}
			System.out.println(min); //0
			//System.out.println(mincoloumn); //2
			//=1
			int max=abc[0][mincoloumn]; //abc[0][2] =5
			int k = 0; // k means row
			while(k<3)//k=0<3,1<3,2<3
			{
			if(abc[k][mincoloumn]>max) //abc[0][2]>5 = 5>5 false, 10>5 true , 0>5 false
			{
			max=abc[k][mincoloumn]; // max=abc[1][2] -> 10
			}
			k++;
			
			}

			System.out.println(max); //10
			}			
	}


