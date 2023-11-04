package polymorphism;
// functional overridden both have same methods and same signature

public class Overridden {

	
	public void cost()
	{
		System.out.println("cost is=" + 12000);
	}
	public void name()
	{
	
		System.out.println("name is=" + "anil");
	}
	public void together()
	{
		
		System.out.println("cost is = " + 12000 +" and "+ "name is = " + "anil");
	}
	
	public static void main(String[] args) {
		Overridden o =new Overridden();
		o.cost();
		o.name();
		o.together();
	}

}
