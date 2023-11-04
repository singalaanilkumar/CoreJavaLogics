/*The super keyword in Java is a reference variable which is used to refer immediate parent class object and Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

Usage of Java super Keyword
super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor.*/
package Super;

public class SuperParent extends SuperChild{

		 void rr()
		    {
		        // referring parent class(i.e, class Parent)
		        // instance variable(i.e, a)
		        System.out.println(super.a);
		 
		        // referring parent class(i.e, class Parent)
		        // static variable(i.e, b)
		        System.out.println(super.b);
		    }
		 
		    public static void main(String[] args)
		    {
		        // Uncomment this and see here you get
		        // Compile Time Error since cannot use 'super'
		        // in static context.
		        // super.a = 700;
		        new SuperParent().rr();
		    
	}

}
