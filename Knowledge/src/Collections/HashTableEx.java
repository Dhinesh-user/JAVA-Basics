package Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Null is not accepted as either key or value if we add it'll throw NullPointerException
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
//		ht.put(null, null);
		ht.put(1, "DK");
		ht.put(2, "AK");
		ht.put(3, "MK");
		ht.put(4, "SK");
//		ht.put(null, "SK");
		System.out.println(ht);

//	  Retriving Data
		System.out.println(ht.get(2));

//    Removing Data
		System.out.println(ht.remove(3));
		System.out.println(ht);

//  Key is present or not 
		System.out.println(ht.containsKey(3));
		System.out.println(ht.containsKey(10));

//  Value is present or not
		System.out.println(ht.containsValue("DK"));
		System.out.println(ht.containsValue("KJ"));

//	isEmpty()
		System.out.println(ht.isEmpty());

//  KeySet() --> returns all the keys as set as duplicate key is not allowed
		System.out.println(ht.keySet());

//  values() --> returns all the values as collections
		System.out.println(ht.values());

//  entrySet()--> returns all the entries as set
		System.out.println(ht.entrySet());

//  accessing each keys
		for (Integer i : ht.keySet()) {
			System.out.print(i + " ");
		}
		System.out.println();

//  accessing each values
		for (String s : ht.values()) {
			System.out.print(s + " ");
		}
		System.out.println();

//	Accessing each entries by using entryset
		for (Object i : ht.entrySet()) {
			System.out.println(i);

//	Accessing each entries by keyset and get method
			for (Integer j : ht.keySet())
				System.out.println(j + " " + ht.get(j));

//  Entry Set Methods
//  Accessing each entries by using entryset with Entry Interface using for each
			for (Map.Entry<Integer, String> entry : ht.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());

			}
//  Accessing each entries by using entryset with Entry Interface using iterator
			System.out.println("each entries by using entryset with Entry Interface using iterator");
			Set<Entry<Integer, String>> s = ht.entrySet();
			Iterator<Entry<Integer, String>> itr = s.iterator();
			while (itr.hasNext()) {
				Map.Entry<Integer, String> entry1 = (Entry<Integer, String>) itr.next();
				System.out.println(entry1.getKey() + " " + entry1.getValue());

			}

		}

	}
}
