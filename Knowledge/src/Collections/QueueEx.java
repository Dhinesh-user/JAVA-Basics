package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

import netscape.javascript.JSObject;

import java.util.Iterator;


public class QueueEx {

	public static void main(String[] args) {
//		Different Declarations for priority Queue
//		PriorityQueue<Integer> pq1= new PriorityQueue<Integer>();
//		Queue q= new PriorityQueue();
		
//		Adding Elements
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(6);
		pq.add(10);
		pq.add(8);
		pq.offer(12);
		pq.add(10);
		System.out.println(pq);
	    
		
		
//		Get Head Element
//		Throws NoSuchElementException if Queue is empty
//		System.out.println(pq.element());
//		Returns Null if the queue is empty
//		System.out.println(pq.peek());
		
//		Removing Elements
//		Returns true/false if we pass element for remove method
//		System.out.println(pq.remove(15)); 
//		Returns the removed head element if we don't pass the element
//		System.out.println(pq.remove()); 
//		System.out.println(pq);
//		Removing with poll method
		System.out.println(pq.poll());
		System.out.println(pq);
		
//	   Traversing through Iterator
       Iterator itr =  pq.iterator();
       while(itr.hasNext())
    	   System.out.println(itr.next());
       
//     Traversing through for each loop
       for(Integer a:pq)
         System.out.println(a);
       
       
        
	}

}
