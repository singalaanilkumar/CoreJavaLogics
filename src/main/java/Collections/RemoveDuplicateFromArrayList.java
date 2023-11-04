package Collections;

import java.util.*;

public class RemoveDuplicateFromArrayList {
    public static void main (String[]args){

        /**  remove duplicate String from using arrays */
        List<String> duplicateList = new ArrayList();
        duplicateList.add("anil");
        duplicateList.add("anand");
        duplicateList.add("anil");
        duplicateList.add("jeevan");
        duplicateList.add("harish");
        duplicateList.add("harish");
        System.out.println("list allow duplicates & List With Duplicates :- " + duplicateList);

        Set<String> removeDuplicate = new HashSet(duplicateList);
        List<String> WithoutduplicateList = new ArrayList(removeDuplicate);
        System.out.println("set doesn't allowed duplicates & List Without Duplicates :- " + WithoutduplicateList);

        /**  remove duplicate value from using arrays */
        List<Integer> duplicateList1 = new ArrayList();
        duplicateList1.add(1);
        duplicateList1.add(2);
        duplicateList1.add(2);
        duplicateList1.add(4);
        duplicateList1.add(5);
        duplicateList1.add(4);
        duplicateList1.add(10);

        System.out.println("list allow duplicates & duplicate values are :- " + duplicateList1);

        Set<Integer> removeDuplicate1 = new HashSet(duplicateList1);
        System.out.println("set doesn't allowed duplicates & here is the without duplicate value :- " + removeDuplicate1);




    }
}
