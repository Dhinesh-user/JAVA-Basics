package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetEx1 {

	public static void main(String[] args) {
//		-->Return in random order
//		  HashSet<Integer>  odd = new HashSet<Integer>();
		  
//		--> return in preserver order
//		 LinkedHashSet<Integer>  odd = new LinkedHashSet<Integer>(); 
		
//		--> Return in sorted order
		 TreeSet<Integer>  odd = new TreeSet<Integer>();
	     odd.add(1);
	     odd.add(5);
	     odd.add(9);
	     odd.add(3);
	     odd.add(7);
	     System.out.println("Odd:"+odd);
	}

}
