package FinalUses;

  class FinalKeyword {
      //if we declare final, we can't change the variable value  and method overridding and we can't extend the final class  name

	 final void method()
	 {
		 System.out.println("If you make any method as final, you cannot override it.");
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i=10; // constant variable
		 //i=5; // showing error as remove final mofifier

	}

}
