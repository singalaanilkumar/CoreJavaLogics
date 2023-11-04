package CoreJavaTopicWiseLogics;

/*Default : access method anywhere in package

protected: variable/method as protected, you can access those in +SubClass with other package  -> sub class means extend 

public : variable/method as public then you will have access across all the package

private: you can not access method (or) variable out side  the class of same package*/

public class AccessModifier {
 int i=10;
 
 protected void modiferBehaviour()
 {
	 System.out.println("public,protected,private,dafault");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
