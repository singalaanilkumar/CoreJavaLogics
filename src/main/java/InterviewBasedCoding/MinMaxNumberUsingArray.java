package InterviewBasedCoding;
/** print min number and max number in multi dimensional array 3*3 matrix */

public class MinMaxNumberUsingArray {
    public static void main(String[] args) {
        //print minimum number
		int min =2;
		int abc[][]= {{9,8,4,3},{3,4,2,0},{7,8,3,2}}; //i=3 rows,j=4 columns
		//System.out.println(min);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(abc[i][j]<2)//abc[0][0]<2 -> 9<2 false like this...condition true means stored that value in min
				{
					min=abc[i][j];
				}
			}
		}
		System.out.println(min);
	}

    /*    //print maximum number
        int max =10;
        int abc[][]= {{9,8,4,3},{3,4,2,11},{7,8,3,2}}; //i=3 rows,j=4 columns
        //System.out.println(min);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(abc[i][j]>max)//abc[0][0]<2 -> 9>11 false like this...after 11>10 condition is true so stored that value in max
                {
                    max=abc[i][j];
                }
            }
        }
        System.out.println(max);
    }*/
}
