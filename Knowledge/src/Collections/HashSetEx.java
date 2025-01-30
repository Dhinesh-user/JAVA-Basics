package Collections;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
//		HashSet hs = new HashSet(); --> default size is - 16
//		HashSet hs = new HashSet(100); --> size is - 100
//		HashSet hs = new HashSet(100,(float)0.60);
//		HashSet<Integer> hs = new HashSet<Integer>();
//		Set<Integer> hs = new HashSet<Integer>();
		

//	    Adding Elements
		HashSet<String> hs = new HashSet<String>();
		hs.add("Benz");
		hs.add("BMW");
		hs.add("Benz");
		hs.add("Pulser");
		hs.add(null);
//		Only one is allowed
		hs.add(null); 
		System.out.println(hs);
		
//		Removing Elements using value only no index concept
		hs.remove("Pulser");
		System.out.println(hs);
		
//		Element present or not 
		System.out.println(hs.contains("BMW"));
		
//		Empty or not 
		System.out.println(hs.isEmpty());
		
//		Reading/Retriving element using for each loop only can't
//		use for loop due to no index method
		System.out.println("..using For Loop");
		for(String s:hs)
			System.out.print(s+" ");
		
//		Reading/Retriving element using Iterator
		System.out.println("\n..Using iterator");
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		
		
		
	}

}
