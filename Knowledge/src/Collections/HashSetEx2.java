package Collections;

import java.util.HashSet;

public class HashSetEx2 {

	public static void main(String[] args) {

     HashSet<Integer>  even = new HashSet<Integer>();
     even.add(2);
     even.add(4);
     even.add(6);
     
     HashSet<Integer>  numbers = new HashSet<Integer>();
     numbers.add(1);
     numbers.addAll(even);
     
     System.out.println("After addAll:"+numbers);
     
     
     numbers.removeAll(even);
     System.out.println("After removeAll:"+numbers);
	
//	 Union, InterSection,Difference bw 2 sets
     HashSet<Integer>  odd = new HashSet<Integer>();
     odd.add(1);
     odd.add(3);
     odd.add(5);
     odd.add(7);
     odd.add(9);
     System.out.println("Odd:"+odd);
     
     HashSet<Integer>  prime = new HashSet<Integer>();
     prime.add(3);
     prime.add(5);
     prime.add(7);
     prime.add(11);
     System.out.println("Prime:"+prime);
     
//   Union --> Duplicated not allowed
//     prime.addAll(odd);
//     System.out.println("Union:"+prime);
     
//   Intersection
//     prime.retainAll(odd);
//     System.out.println("InterSection:"+prime);
     
//   Difference
//     prime.removeAll(odd);
//     System.out.println("Difference:"+prime);
     System.out.println("Odd:"+odd);
     odd.removeAll(prime);
     System.out.println("After prime removal odd set:"+odd);
     
//    SubSet
     System.out.println("Subset:"+odd.containsAll(prime));

	}

}
