package staticKeyword;

public class StaticKeyword {

	//static method
	public static void anil() {
		System.out.println("using static keyword in method it will invoke class not object , it is invoke to class that's why we are passing method without object");
	}

	//non-static method
	public  void anil1() {
		System.out.println("non-static method");
	}

	public static void main(String[] args) {
		StaticKeyword sk= new StaticKeyword();
		anil();//using static keyword in method it will invoke class not object , it is invoke to class that's why we are passing method without object
		sk.anil1();
	}

}
