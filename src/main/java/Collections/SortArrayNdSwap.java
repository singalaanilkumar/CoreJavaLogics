package Collections;

public class SortArrayNdSwap {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			     int a[]= {2,6,1,4,9}; //5..a[0],a[1],a[2],a[3],a[4]
			     int temp;
			     
			// sorting like this...2,6,1,4,9 - 1,6,2,4,9 - 1,2,4,6,9
			     
			    for(int i=0;i<5;i++) // i=0,1,2,3,4
			    {
			    for(int j=i+1;j<5;j++) // j=0+1=1 - J=0+2=2 - j=0+3=3 - J=0+4 =4 - j=0+5=5 after j=1+1=2 , j=3,j=4,j=5
			    {
			    if(a[i] > a[j]) 
			    {
			    temp=a[i]; 
			    a[i]=a[j]; 
			    a[j]=temp; 
			   
			    }
			    }
		
			     }
			for(int i=0;i<5;i++)
			{
			System.out.println(a[i]); // 1,2,4
			
			}
	}

}
