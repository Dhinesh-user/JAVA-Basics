package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
//	 If we pass Duplicate key value of the key changed with latest value
		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "DK");
		m.put(3, "AK");
		m.put(2, "VJ");
		m.put(4, "AK");
		m.put(2, "VJD");
		System.out.println(m);
		System.out.println(m.entrySet());

//   Getting value by using Key
		System.out.println(m.get(1));

//   Remove value with key by passing key
//   Remove()--> returns the removed value and remove it from map		
		System.out.println(m.remove(1));
		System.out.println(m);
		
//  Key is present or not 
		System.out.println(m.containsKey(3));
		System.out.println(m.containsKey(10));
		
//  Value is present or not
		System.out.println(m.containsValue("VJD"));
		System.out.println(m.containsValue("KJ"));
		
//	isEmpty()
		System.out.println(m.isEmpty());
		
//  KeySet() --> returns all the keys as set as duplicate key is not allowed
		System.out.println(m.keySet());
		
//  values() --> returns all the values as collections
		System.out.println(m.values());
		
//  entrySet()--> returns all the entries as set
		System.out.println(m.entrySet());

//  accessing each keys
		for(Integer i:m.keySet()) {
			System.out.print(i+" ");
		}
		System.out.println();
	
//  accessing each values
		for(String s:m.values()) {
			System.out.print(s+" ");
		}
		System.out.println();
		
//	Accessing each entries by using entryset
		for(Object i:m.entrySet()) {
			System.out.println(i);
		}
		
//  Accessing each entries by keyset and get method
		for(Integer i:m.keySet())
			System.out.println(i+" "+m.get(i));
		
		
//	Entry Set Methods
//  Accessing each entries by using entryset with Entry Interface using for each
		for(Map.Entry<Integer, String> entry:m.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
//  Accessing each entries by using entryset with Entry Interface using iterator
			System.out.println("each entries by using entryset with Entry Interface using iterator");
			Set<Entry<Integer, String>> s= m.entrySet();
			Iterator<Entry<Integer, String>> itr= s.iterator();
			while(itr.hasNext()) {
				Map.Entry<Integer, String> entry1 = (Entry<Integer, String>) itr.next();
				System.out.println(entry1.getKey()+" "+entry1.getValue());
				
			}
			
		}
	
}
