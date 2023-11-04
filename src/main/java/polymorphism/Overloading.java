package polymorphism;

public class Overloading {
	/* functional overloading
	 * either argument count should be different or argument data type should be different
	*/
		
		public void cost(int a)
		{
			System.out.println(a);
		}
		public void name(String a)
		{
		
			System.out.println(a );
		}
		public void together(int a,int b)
		{
			
			System.out.println(a + b);
		}
		
		public static void main(String[] args) {
			//Overridden o =new Overridden();
			Overloading o =new Overloading();
			o.cost(15000);
			o.name("xl");
			o.together(50, 100);
		}

	}
	
