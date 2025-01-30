package Collections;

import java.util.LinkedList;


public class Queue_LinkedListEx {

	public static void main(String[] args) {
		 
		
//		Insertion order maintained
//		Duplicates allowed
//		Heterogenous allowed
		LinkedList pq = new LinkedList();
		pq.add(6);
		pq.add(10);
		pq.add(10);
		pq.add(8);
		pq.offer(12);
		pq.add("DK");
		System.out.println(pq);

	}

}
