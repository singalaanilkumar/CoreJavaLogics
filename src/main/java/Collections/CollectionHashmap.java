package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionHashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "hello");
		hm.put(1, "Gudbye");
		hm.put(42, "morning");
		hm.put(3, "evening");


		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		Set sn= hm.entrySet();
		Iterator it =sn.iterator();
		//hashtable -pass table set collections 
		while(it.hasNext())
		{
		//System.out.println(it.next()); -> getting NosuchElementException
		Map.Entry mp=(Map.Entry)it.next();// it help to move next index
		System.out.println(mp.getKey()); // printing the key value i mean index
		System.out.println(mp.getValue()); // printing the value i mean index string value


		}

	}

}
