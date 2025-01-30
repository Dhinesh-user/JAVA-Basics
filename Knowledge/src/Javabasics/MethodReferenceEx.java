package Javabasics;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> names = Arrays.asList("DK", "VK", "HK");
//		List<String> lowernames = names.stream()
//				                   .map(s-> s.toLowerCase())
//				                   .toList();
//		System.out.println(lowernames);

//		By passing one method to another method is called method reference
		List<String> lowernames = names.stream()
				.map(String::toLowerCase) // Method Reference
				.toList();

		lowernames.forEach(System.out::println);

	}

}
