package Javabasics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamSecondHighestNumber {

	public static void main(String[] args) {
		 List<Integer> nums = Arrays.asList(5,7,2,4,9,8);
		
		 Optional<Integer> result = nums.stream()
				 .distinct()
				 .sorted(Comparator.reverseOrder())
			     .skip(1)
				 .findFirst();
		 System.out.println(result);
		 
		 if(result.isPresent())
			 System.out.println(result.get());
		 else
			 System.out.println("No value");
	}

}
