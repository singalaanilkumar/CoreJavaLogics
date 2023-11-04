package loops;

public class LoopsDemo {

	public static void main(String[] args) {
	    for (int i=0; i<10;i=i +2)
	        if(i==8)
	        {
	    System.out.println("printed");
        System.out.println("anils");
	        }
	        else
	        {
	       System.out.println("not printed");      
	        } 
		
		/* for(int i=0;i<3;i++) //0,1,2
		{
			System.out.println("outer loop started");
			for(int j=0;j<=4-i;j++) // 4 times , 3 times, 2 times printed this inner loop
			{
				System.out.println("inner loop started");
			}
			System.out.println("outer loop is finished");
		} */
		
		
		/*int k=1;
		 for(int i=0;i<4;i++) //i=0,1,2,3
		{
			//System.out.println("outer loop started");
			for(int j=1;j<=4-i;j++) // 4 times , 3 times, 2 times, 1time printed this inner loop
			{
				System.out.print(k);// 1,2,3,4 , 5,6,7 , 8,9 , 10
				System.out.print("\t"); // \t is allocated to spaces
				k++;
			}
			System.out.println(""); // blank
		}
/*output task :-1234
		        567
		        89
		        10 */
		
		
		/*int k=1;
		 for(int i=1;i<=4;i++) //i=1,2,3,4
		{
			//System.out.println("outer loop started");
			for(int j=1;j<=i;j++) // 1 times , 2 times, 3 times, 4 time printed this inner loop
			{
				System.out.print(k);// 1 , 2,3 , 4,5,6 , 7,8,9,10
				System.out.print("\t"); // \t is allocated to spaces
				k++;
			}
			System.out.println(""); // blank
		}
		/*output task :-
		 1
		 23
		 456
		 78910 */
		
		
		/* for(int i=1;i<=4;i++) //i=1,2,3,4
		{
			//System.out.println("outer loop started");
			for(int j=1;j<=i;j++) // 1 times , 2 times, 3 times, 4 time printed this inner loop
			{
				System.out.print(j);// 1 , 2,3 , 4,5,6 , 7,8,9,10
				System.out.print("\t"); // \t is allocated to spaces
			}
			System.out.println(""); // blank
		} */
		/*output task :- 
		 1
		 12
		 123
		 1234 */
		

}}