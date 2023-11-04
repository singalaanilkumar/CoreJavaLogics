package Collections;

public class ArraySwap {

	public static void main(String[] args) {
		//with temp variable
		/*int a=10;
		int b=11;
		int temp;
		temp=b;
		b=a;
		a=temp;
		System.out.println(a);
		System.out.println(b);*/
		
		//without temp variable
		int a=12;
		int b=13;
		a=a+b;// 12+13=25
		b=a-b;//25-13=12
		a=a-b;//25-12=13
		System.out.println(a);
		System.out.println(b);

	}

}
