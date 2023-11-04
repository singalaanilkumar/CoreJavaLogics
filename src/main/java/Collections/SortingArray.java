package Collections;

public class SortingArray {

	public static void main(String[] args) {
		 int a[]= {44,88,22,77,99}; //5..a[0],a[1],a[2],a[3],a[4]
	     int temp; // do debug u get more clarity	     
	    for(int i=0;i<5;i++) // i=0,1,2,3,4 //22 88 44 77 99
	    {
	    for(int j=0;j<5;j++)//decending  //5 5 5 5 5
	    //for(int j=i;j<5;j++) // acending  //5 4 3 2 1 
	    {
	    if(a[i] > a[j])
	    {
	    temp=a[i]; 
	    a[i]=a[j]; 
	    a[j]=temp; 
	   
	    } }}
	    
	for(int array : a)
	{
	System.out.println(array); // 1,2,4
	
	}

	}


}
