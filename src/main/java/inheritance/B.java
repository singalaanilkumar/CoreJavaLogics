package inheritance;

public class B  extends  A{
    int i=10;
    public static void main(String []args)
    {
        B b = new B(); //10
        A b1= new B(); //20
        A a1 = new A(); //20
       // B a2 = (B) new A();//ClassCastException: inheritance.A cannot be cast to inheritance.B
        System.out.println(b.i);
        System.out.println(b1.i);
        System.out.println(a1.i);
        //System.out.println(a2.i); //getting "java.lang.ClassCastException" exception because of class B can't be extended with class  A
    }
}
