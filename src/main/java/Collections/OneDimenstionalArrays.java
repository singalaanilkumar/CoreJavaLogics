
package Collections;
/*Arrays are used to store multiple values in a single variable.instead of declaring separte variables fr each values

limatations:-
  1. fixed in size
  2. homogenous represented only
  3. no uderlying data staructure
   ex:-Student []s=new Student[10000]; //10000 fixedSize
    
     Syntax to Declare an Single Dimensional Array in Java :-
       dataType[] arr; (or)  
       dataType []arr; (or)  
       dataType arr[];  ex:-int[] a; ,int []a; , int a[]; 
       
       s[0]=new Student (); -> homogenous
       s[1]=new Customer(); -> it's not homogenous
       Homegeneous:- collection of objects of the same class type are called homogeneous collectiom
       Hetergenous:- collection of objects with different  class type are called hetergenous collection

     Syntax to Declare Multidimensional Array in Java:-
       dataType[][] arrayRefVar; (or)  
       dataType [][]arrayRefVar; (or)  
       dataType arrayRefVar[][]; (or)  
       dataType []arrayRefVar[]; ex:-int[][] a; , int [][]a;  */

public class OneDimenstionalArrays {

	public static void main(String[] args) {
			/*int a []=new int[5];//declaration and instantiation  
			a[0]=10;//initialization  
			a[1]=20;  
			a[2]=70;  
			a[3]=40;  
			a[4]=50;  */
			//traversing array  
		
		   int a[]={50,60,70,80};  
		   for(int i=0;i<=a.length;i++)//ArrayIndexOutOfBoundsException because:4, i<=3
			   
			//int a[]={33,3,4,5};//declaration, instantiation and initialization  
			//for(int i=0;i<a.length;i++)//length is the property of array 
			   
			System.out.println(a[i]);
	}

}
