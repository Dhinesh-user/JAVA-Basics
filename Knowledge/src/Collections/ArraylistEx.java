package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraylistEx {

	public static void main(String[] args) {
		
//		ArrayList declaration and adding function
		
//		ArrayList al= new ArrayList();
//		ArrayList<Integer> al = new ArrayList<Integer>();
		
//		Heterogeneous Data
		List arr= new ArrayList();
		arr.add("Allen");
		arr.add(54);
		arr.add('c');
		arr.add(13.3);
		arr.add(1);
		System.out.println(arr);
		
//		Add value with index
		arr.add(1, "solly");
		System.out.println(arr);
		
//		if we have both index and element are same it will remove index position value not an element
		arr.remove(1);
		System.out.println(arr);
		
		List<String> al = new ArrayList<String>();
		al.add("Benz");
		al.add("BMW");
		al.add("Benz");
		al.add("Pulser");
		al.add(null);
		System.out.println(al);
		
//		Replace or change an element
		al.set(1, "Mahindra");
		System.out.println(al);
		
//      Verify the element is available in the list or not
//		contains() - Returns true/false
		System.out.println("Contains Mahindra:"+al.contains("Mahindra"));
	
//		Get the value using index
		String s = al.get(0);
		System.out.println(s);
		
//      Get the index of obj and lastindex of obj 	
		int i = al.indexOf(s);
		System.out.println(i);
		System.out.println(al.lastIndexOf("Benz")); 
		System.out.println(al.indexOf("yamaha"));
		

		
//		To remove a particular object by passing index
		al.remove(2);
		System.out.println(al);
		
//		To remove a particular object by passing Object value
		al.remove("Pulser");
		System.out.println(al);
		
//		Return true if the list is empty
		System.out.println(al.isEmpty());
		
//		Traverse Arraylist using foreach loop
		for(String str:al)
			System.out.print(str+" ");
		System.out.println();
		
//		Traverse Arraylist using for loop
		for(int j =0; j<al.size();j++) 
			System.out.print(al.get(j)+" ");
		System.out.println();
			
//		Traverse arraylist using ListIterator for forward navigation
		ListIterator<String> itr = al.listIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		
//		Traverse arraylist using ListIterator for backward navigation		
		ListIterator<String> itr1 = al.listIterator();
		while(itr1.hasPrevious()) {
			System.out.print(itr1.previous());
		}
		System.out.println();
		
//		Traverse arraylist using Iterator
		Iterator<String> itr2 = al.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+" ");
		}
		
//		Multithreading concept - throws ConcurrentModification Exception
		ListIterator<String> itr3 = al.listIterator();
		while(itr3.hasNext()) {
			System.out.print(itr3.next()+" ");
			al.add("Suzuki");
		}
		}

}
