package CoreJavaTopicWiseLogics;

public class Method {
	public String  anil()
	{
	    return "anil kumar";
	}

	public int anil1()
	{
	    return 10;
	}

	public void anil2()
	    {
	        System.out.println("void means we not returned anything so mentioned void");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m= new Method();
		  String name = m.anil();
		  int value = m.anil1();
		  System.out.println(name);
		   System.out.println(value);
		   m.anil2();

	}

}
