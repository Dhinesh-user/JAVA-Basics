package Javabasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
	List<Integer> arr = Arrays.asList(2,3,4,5,6,7);
	Stream<Integer> s1 = arr.stream();
	Stream<Integer> s2 = s1.filter(n->n%2==0);
	Stream<Integer> s3 = s2.map(n->n*2);
	int result = s3.reduce(0, (c,e)->c+e);
	System.out.println(result);
	
	
//	 method chaining
	List<Integer> arr1 = Arrays.asList(2,3,4,5,6,7);
	 int sum = arr1.stream()
			     .filter(n->n%2==0)
			     .map(n->n*2)
			     .reduce(0, (c,e)->c+e);
	 System.out.println(sum);
	
	}

}
