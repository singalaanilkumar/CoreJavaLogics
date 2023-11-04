package FinalUses;

public class FinalExtendClass extends FinalKeyword {
	// final class FinalKeyword means getting error in this class
	public void anil()
	{

		final int i=10;
		System.out.println(i);
		System.out.println("if class name as final we can't extend that class");
	}

	/*void method() // If you make any method as final, you cannot override it.
	 {
		 System.out.println("If you make any method as final, you cannot override it.");
	 }*/

	public static void main(String[] args) {
		FinalExtendClass fec=new FinalExtendClass();
		fec.anil();
		fec.method();
	

	}

}
