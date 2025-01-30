package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> LL1 = new LinkedList<String>();
		LL1.add("Bike");
		LL1.add("car");
		LL1.add("flight");
		System.out.println("LinkedList1:"+LL1);
//		Using Poll methods
//		System.out.println(LL1.poll());
//		System.out.println(LL1.pollFirst());
//		System.out.println(LL1.pop());
		System.out.println(LL1.peek());
		System.out.println(LL1);
		
		
//		Add element in first & Last position
		LL1.addFirst("MT15");
		LL1.addLast("Duke");
		System.out.println(LL1);
		
//		Remove first and Last element
		LL1.removeFirst();
		LL1.removeLast();
		System.out.println(LL1);
		
//		Retrive first and last element
		System.out.println(LL1.getFirst());
		System.out.println(LL1.getLast());
	}

}
