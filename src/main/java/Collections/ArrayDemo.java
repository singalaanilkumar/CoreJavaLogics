package Collections;

public class ArrayDemo {
// a container which stores multiple values of same data-type
	public static void main(String[] args) {
		int a[]= new int[5]; // Delcares an array and allocates memory for the values
		int b[]= {2,3,4,5,6,7,8,9};
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;//initilased values into that array
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);// retrieve values present in this array	
		}
		for(int i=0;i<7;i++)
		{
			System.out.println(b[i]);// retrieve values present in this array	
		}
		System.out.println(a.length);
		System.out.println(b.length);
	}

}
