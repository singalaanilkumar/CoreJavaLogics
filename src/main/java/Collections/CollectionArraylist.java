package Collections;

import java.util.ArrayList;

public class CollectionArraylist {

	// can accept duplicate values
	//ArraList,LinkedList,vector- Implementing List interface
	//array have fixed size where as arraylist can grow dynamicaly
	//you can access and insert any value in any index
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("anil");
		a.add("kumar");
		a.add("singala");
		System.out.println(a);
		a.add(1, "from kothakota");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.remove("kumar");
		System.out.println(a);
		System.out.println(a.get(1));
		// testing
		System.out.println(a.contains("java"));
		System.out.println(a.indexOf("singala"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		}

}
