package Javabasics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassEx {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Arun","Lami","Dk","Rohit");
		
		Optional<String> result   = names.stream()
				                 .filter(s->s.contains("x"))
				                 .findFirst();
		if(result.isPresent())
			System.out.println(result.get());
		else
			System.out.println("No value");
		
//	  We could use this way
	  System.out.println(result.orElse("No value"));
		
//    If we are not having value with letter x then nullpointer exception will be thrown
//    To avoid the same we are using optional class and ispresent() boolean condition
//    along with if else condition loops
//	  To get the value we can get() method
	  
//	  Without optional class we could implement
	  
	  String val = names.stream()
			  .filter(s->s.contains("x"))
			  .findFirst()
			  .orElse("No value");
	 
	  
	}

}
