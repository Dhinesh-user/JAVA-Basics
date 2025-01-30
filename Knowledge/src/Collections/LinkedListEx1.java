package Collections;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LinkedListEx1 {

	public static void main(String[] args) {
//		To add all the objects into another arraylist
		List<String> LL1 = new LinkedList<String>();
		LL1.add("Bike");
		LL1.add("car");
		LL1.add("flight");
		System.out.println("LinkedList1:"+LL1);
		
		List<String> LL = new LinkedList<String>();
		LL.add("MT");
		LL.add("pulser");
		LL.add("Benz");
		LL.add("FZ");
		
		
		System.out.println("LinkedList:"+LL);
		
		LL.addAll(LL1);
		System.out.println("After adding al1 to al:"+LL);
		
//		To retain all the objects of array in array1
//		al.retainAll(al1);
//		System.out.println("After Retaining al1 in ArrayList al:"+al);
//		
		
//		To clear all the objects in Linkedlist
//		LL1.clear();
//		System.out.println(LL1);
		
//		To remove all the objects
		LL.removeAll(LL1);
		System.out.println("After removing all the al object:"+LL);
		
//		to sort elements in Linkedlist
		Collections.sort(LL);
		System.out.println("After sorting:"+LL);
		
//		To sort in reverse Order
		Collections.sort(LL, Collections.reverseOrder());
		System.out.println("Reverse Sorting:"+LL);
		
//		To shuffle the elements in list
		Collections.shuffle(LL);
		System.out.println("After Shuffling:"+LL);
		
//		To Convert Array into List
		String llst[]= {"cat","aps","lion"};
		for(String s :llst)
		System.out.println("Array:"+s);
		
		List<String> Linklst = new LinkedList<String>();
		Linklst= Arrays.asList(llst);
		System.out.println(Linklst);
		
//		To convert from list to array
		Object arr1[] = Linklst.toArray();
		for(Object o:arr1)
			System.out.println(o);
		
		
		
	}

}
