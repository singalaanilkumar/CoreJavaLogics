package Strings;

public class ReverseString {

	public static void main(String[] args) {
		

		    String s = "anil"; //0123=anil

		    String t = ""; //"" is a string

		   for (int i=s.length()-1;i>=0;i--)
		  // logic:-  i=3,3>=0;3--;  i=2,2>=0,2--;  i=1,1>=0,1--,  i=0,0>=0,0--

		    {
                //System.out.print(s.length()-1);
               // System.out.println(s.charAt(i));
                t= t + s.charAt(i);
		    }
		   System.out.println(t);// string + string = string
	}

}
