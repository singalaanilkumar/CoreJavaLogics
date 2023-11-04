package This;

public class ThisKeyword {
 int a=5; // instance variable/class variable
 
 private void anil()
 {
 int a=10; // Local Variable
 int b=a+this.a;
	System.out.println(a);
	System.out.println(this.a);// this refers to current object - object scope  in class level means instance variable 
	System.out.println(b);
 }
	public static void main(String[] args) {
		ThisKeyword tk= new ThisKeyword();
		tk.anil();
        
	}

}
