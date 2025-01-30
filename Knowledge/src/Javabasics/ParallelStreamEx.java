package Javabasics;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelStreamEx {

	public static void main(String[] args) {
		int s = 1000;
		List<Integer> nums = new ArrayList<Integer>(s);
		Random r = new Random();
		for(int i=1;i<=s;i++) {
			nums.add(r.nextInt(100));
			
		}
		System.out.println(nums);
		Integer s1 = nums.stream()
				.map(n-> n*2)
				.reduce(0,(c,e)->c+e);
		System.out.println(s1);
		
//		MaptoInt changes the stream as intstream and 
//		sum() method accepts only intstream object
		long startseq = System.currentTimeMillis();
		Integer sum1 =  nums.stream()
				      .map(n->n*2)
				      .mapToInt(n->n)
				      .sum();
		System.out.println(sum1);
		long endseq = System.currentTimeMillis();
		System.out.println("Seq time taken:"+(startseq-endseq));
		
		long startpara = System.currentTimeMillis();
		Integer sum2 =  nums.stream()
				      .map(n->n*2)
				      .mapToInt(n->n)
				      .sum();
		System.out.println(sum2);
		long endpara = System.currentTimeMillis();
		System.out.println("Parallel time taken:"+(startseq-endseq));
		
		
		
	}

}
