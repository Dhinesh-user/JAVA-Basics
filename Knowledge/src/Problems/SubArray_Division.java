package Problems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * Complete the 'birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 *  Example:
 *  Array s ={2,2,1,3,1,2};
 *  d = 4;
 *  m =2;
 *  
 */
public class SubArray_Division {
	 public static int birthday(List<Integer> s, int d, int m) {
		    // Write your code here
//		     int sum = 0;
		     int count = 0;
		     System.out.println(d);
		     List<Integer> a = new ArrayList<Integer>();
		     for(int i =0;i<s.size()-m+1;i++){
		    	 int sum = 0;
		         for(int j=i;j<i+m;j++){
		             sum = sum+s.get(j);
		             System.out.println("sum is:"+sum);
		             if(sum == d) {
		             a.add(s.get(i));
		             a.add(s.get(j));
		             System.out.println("ele"+s.get(i)+""+s.get(j));
		             }
		         }
		          sum=0;   
		         }
		     count = a.size()/2;
			return count;
		     }
		     
	public static void main(String[] args) {
		List<Integer> s = new ArrayList<>(Arrays.asList(2,2,1,3,1,2));
		int day =4;
		int month = 2;
        int result = SubArray_Division.birthday(s,day,month);
        System.out.println(result);
		  

		   
		         
		 

		
		    
		       
	}
	}


