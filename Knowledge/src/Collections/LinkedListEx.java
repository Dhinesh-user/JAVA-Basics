package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		
//   Diff Declarations for LinkedList
	 List l= new LinkedList();
	 List<Integer> l1 = new LinkedList<Integer>();
	 LinkedList l2 = new LinkedList();
	 LinkedList<Integer> l3 = new LinkedList<Integer>();
	 
	 
		
//   Diff Add methods in LinkedList
	 List<Integer> LL = new LinkedList<Integer>();
     LL.add(6);
     LL.add(5);
     LL.add(4);
     LL.add(9);
     LL.add(7);
     LL.add(1, 10);
     System.out.println(LL);
     
//   Size of LinkedList
     System.out.println(LL.size());
     
//   Remove the element by Index only
     LL.remove(2);
     System.out.println(LL);
     
//   Retriving Element
     System.out.println(LL.get(1));
     
//   Change the value in a particular place
     LL.set(0, 11);
     System.out.println(LL);
     
//   Verify the element present or not
     System.out.println(LL.contains(11));
     
//		Traverse LinkedList using foreach loop
        System.out.println("...Using For Each Loop..");
		for(Integer str:LL)
			System.out.print(str+" ");
		System.out.println();
		
//		Traverse Arraylist using for loop
		System.out.println("...Using For Loop..");
		for(int j =0; j<LL.size();j++) 
			System.out.print(LL.get(j)+" ");
		System.out.println();
		
//		Traverse arraylist using Iterator
		System.out.println("...Using While Loop..");
		Iterator<Integer> itr2 = LL.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+" ");
		}
	}

}
