package Constructor;

public class Constructor {
	//will not return values
	//name of constructor should be the class name
	
	//Default constructor
	public Constructor()
	{
		System.out.println("default constructor");
	}
	
	//parameter constructor
	public Constructor(int a)
	{
		System.out.println("parameter constructor");
	}
	
	public Constructor(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	public Constructor(String s)
	{
		System.out.println("string constructor");
		System.out.println(s);
	}
	
	//return type method
	public  void getreturn()
	{
		System.out.println("void is a return type");
	}
	public static void main(String[] args) {
		
		Constructor c= new Constructor();//default constructor
		Constructor c1= new Constructor(2);//parameter constructor
		Constructor c2= new Constructor(2,3);//parameter constructor
		Constructor c3= new Constructor("anil");//string constructor
		c.getreturn(); // return type
		
	}
	// compiler will call implict constructor if you have not defined constructor block
	//when ever you create an object constructor is called
	//block of code when ever an object is created
}
