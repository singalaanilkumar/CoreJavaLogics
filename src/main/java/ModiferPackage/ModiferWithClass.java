/*Default : access method anywhere in package

protected: variable/method as protected, you can access those in +SubClass with other package  -> sub class means using  extend 

public : variable/method as public then you will have access across all the package

private: you can not access method (or) variable out side  the class of same package*/
package ModiferPackage;


import CoreJavaTopicWiseLogics.AccessModifier;

public class ModiferWithClass extends AccessModifier {

	public static void main(String[] args) {
		ModiferWithClass mwc= new ModiferWithClass();
		mwc.modiferBehaviour();
		
		/*AccessModifier am = new AccessModifier();
		am.modiferBehaviour();*/ //without using extend keyword approach this object creation

		
	}

}
