package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
//		To add all the objects into another arraylist
		List<String> al1 = new ArrayList<String>();
		al1.add("Bike");
		al1.add("car");
		al1.add("flight");
		System.out.println("ArrayList1:"+al1);
		
		List<String> al = new ArrayList<String>();
		al.add("MT");
		al.add("pulser");
		al.add("Benz");
		al.add("FZ");
		
		
		System.out.println("ArrayList:"+al);
		
		al.addAll(al1);
		System.out.println("After adding al1 to al:"+al);
		
//		To retain all the objects of array in array1
//		al.retainAll(al1);
//		System.out.println("After Retaining al1 in ArrayList al:"+al);
//		
		
//		To clear all the objects in arraylist
//		al1.clear();
//		System.out.println(al1);
		
//		To remove all the objects
		al.removeAll(al1);
		System.out.println("After removing all the al object:"+al);
		
//		to sort elements in arraylist
		Collections.sort(al);
		System.out.println("After sorting:"+al);
		
//		To sort in reverse Order
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Reverse Sorting:"+al);
		
//		To shuffle the elements in list
		Collections.shuffle(al);
		System.out.println("After Shuffling:"+al);
		
//		To Convert Array into List
		String arr[]= {"cat","aps","lion"};
		for(String s :arr)
		System.out.println("Array:"+s);
		
		List<String> arrlst = new ArrayList<String>();
		arrlst= Arrays.asList(arr);
		System.out.println(arrlst);
		
//		To convert from list to array
		Object arr1[] = arrlst.toArray();
		for(Object o:arr1)
			System.out.println(o);
		
		
		
	}

}
