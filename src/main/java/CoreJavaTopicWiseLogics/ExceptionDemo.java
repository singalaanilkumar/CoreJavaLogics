package CoreJavaTopicWiseLogics;

public class ExceptionDemo {

	//one try can be followed by multiple catch blocks
	//catch should be an immediate block after try

	public static void main(String[] args) {
		
		int b=7;
		int c=0;

		try
		{
		//  purchased fail
		    //int k=b/c;// ArithmeticException
		   // System.out.println(k);
		int arr[]=new int[5];  //IndexOutOfBoundsExceptio
		System.out.println(arr[7]);
		       
		}

		catch(ArithmeticException et)
		{
		System.out.println("I catched the Arthimetic/exception");
		}

		catch(IndexOutOfBoundsException ets)
		{
		System.out.println("I catched the IndexBound/exception");
		}
		catch(Exception e)
		{
		//  retry again
		System.out.println("I catched the error/exception");
		}
		finally // using finally  we are printing statement in console  is fail r pass, using JVM we can stop the printing statement
		{
		System.out.println("delete cookies");//THis block is executed irrespective of exception thrown or not
		}

		}
	}