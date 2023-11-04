package Super;
/*The super keyword in Java is a reference variable which is used to refer immediate parent class object and Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

Usage of Java super Keyword
super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor.*/
public class SuperChildClass extends SuperParentClass {
    
	String name= "anil";
	public SuperChildClass()
	{
		super();
		System.out.println("chlid class constructor");
	}
	public void getdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	public void getparentdata()
	{
		super.getparentdata();
		System.out.println("child data");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChildClass scc= new SuperChildClass();
		scc.getdata();
		//scc.getparentdata();

	}

}
