package InterviewBasedCoding;

import java.util.ArrayList;

public class CompareArray {
    /** //compare same indexes of 2 different arrays and create another array for matching values */
    public static void main(String[] args) {
        int a[] = {1, 4, 5, 7,9};
        int b[] = {6, 4, 3, 7,8};
        ArrayList <Integer> arrayList=new ArrayList();
        for(int i=0;i<a.length;i++)
        if(a[i] == b[i])
        {
            //code to create another array
            arrayList.add(a[i]);
            //System.out.println(a[i]);
        }
       Object[] c= arrayList.toArray();
        for(Object obj : c) {
            System.out.println(obj);
        }
    }
}
