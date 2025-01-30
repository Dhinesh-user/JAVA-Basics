package Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubStringWithoutRepeats {

	public static void main(String[] args) {
		        
		        Scanner sc = new Scanner(System.in);
		        String s = sc.nextLine();
		        System.out.println(s);
		        Map<Character,Integer> map= new HashMap<Character,Integer>();
		        int start =0; 
		        int ans=0;
		        for(int end=0;end<s.length();end++){
		        	System.out.println("keyset"+map.keySet());
		        	System.out.println(map.containsKey(s.charAt(end)));
		            if(map.containsKey(s.charAt(end)))
		            {
		             System.out.println("Map char"+map.get(s.charAt(end)));
		             start = Math.max(start, map.get(s.charAt(end))+1);
		             System.out.println("Start"+start);
		            }
		            map.put(s.charAt(end),end);
		            ans = Math.max(ans,end-start+1);
		            System.out.println("Answer"+ans);
		            System.out.println("Map"+map);
		        }
		        
		        System.out.println(ans);
		           
		    }
		}
	