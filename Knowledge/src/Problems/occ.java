package Problems;

import java.util.HashMap;
import java.util.Map;

public class occ {

	public static void main(String[] args) {

		String s = "dhinesh";
		
		System.out.println(s);
		char[] ch = s.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
	    for(int i = 0;i<ch.length;i++) {
	    	if(map.containsKey(ch[i]))
		        map.put(ch[i], map.get(ch[i])+1);
	    	else
	    		map.put(ch[i], 1);
           }
	    System.out.println(map);

}
	}
