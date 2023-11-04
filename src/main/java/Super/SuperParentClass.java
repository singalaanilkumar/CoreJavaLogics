/*The super keyword in Java is a reference variable which is used to refer immediate parent class object and Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

Usage of Java super Keyword
super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor.*/

package Super;

public class SuperParentClass {
	String name="anilkumar";
	public SuperParentClass()
	{
		System.out.println("parent class constructor");
	}
	public void getparentdata()
	{
		System.out.println("parent data");
	}
	public static void main(String[] args) {
		SuperParentClass spc = new SuperParentClass();
		spc.getparentdata();
		

	}

}
