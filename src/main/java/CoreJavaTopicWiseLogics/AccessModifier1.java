/*Default : access method anywhere in package

protected: variable/method as protected, you can access those in +SubClass with other package  -> sub class means using  extend 

public : variable/method as public then you will have access across all the package

private: you can not access method (or) variable out side  the class of same package*/
package CoreJavaTopicWiseLogics;

public class AccessModifier1  extends AccessModifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifier1 amo= new AccessModifier1();
		amo.modiferBehaviour();
		
		/*AccessModifier am = new AccessModifier(); // using public/default method we are using this kind of approach
		am.modiferBehaviour();*/
		
	}

}
