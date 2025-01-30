package Javabasics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamEx2 {

	public static void main(String[] args) {
		
		
		
		
		List<Integer> arr1 = Arrays.asList(2,3,4,5,6,7);
//		Predicate<Integer> p = new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer n) {
//				if(n%2==0)
//					return true;
//				else 
//					return false;
//			}
//			
//		};
//		We can predicate 
		 int sum = arr1.stream()
				     .filter(n -> n%2==0)
				     .map(n->n*2)
				     .reduce(0, (c,e)->c+e);
		 System.out.println(sum);
		
	}

}
