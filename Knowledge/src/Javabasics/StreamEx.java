package Javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {


		List<Integer>  arr = new ArrayList<Integer>(Arrays.asList(3,5,2,7,6,4));
		arr.forEach(n -> System.out.println(n*2));
		System.out.println(arr);
//		Stream<Integer> s1 = arr.stream();
//		s1.forEach(n -> System.out.println(n+2));
//		System.out.println(s1);
//		System.out.println(arr);
//		
		Stream<Integer> s2 = arr.stream();
		Stream<Integer> s3 = s2.filter(n->n%2==0);
//		s3.forEach(n -> System.out.println(n));
		
//		If we use the above forEach method then S3 stream objects gets closed 
//		then throws an exceptions like this
//		Exception in thread "main" java.lang.IllegalStateException: 
//			stream has already been operated upon or closed
		Stream<Integer> s4 = s3.map(n-> n*2);
		s4.forEach(n->System.out.println(n));
		
	}

}

// HackerRank Reading user input and getting output 
// BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//int t = Integer.parseInt(bufferedReader.readLine().trim());
//
//IntStream.range(0, t).forEach(tItr -> {
//    try {
//        long n = Long.parseLong(bufferedReader.readLine().trim());
//
//        String result = Result.counterGame(n);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//    } catch (IOException ex) {
//        throw new RuntimeException(ex);
//    }
//});
//
//bufferedReader.close();
//bufferedWriter.close();
//}
//}
