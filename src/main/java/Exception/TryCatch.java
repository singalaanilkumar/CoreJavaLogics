package Exception;

public class TryCatch {
    public static void main(String[]args){
        int i=0;
        int j=0;
        //j= 10/i;

        try{
            j= 10/i;
        }
        catch (Exception e)
        {
            System.out.println("something went wrong, we get :- " + e);
        }
        System.out.println("print next step"); // if we get any exception this step will not executed at the time we use try,catch to handle that exception then next step smoothly execute.
    }


}
