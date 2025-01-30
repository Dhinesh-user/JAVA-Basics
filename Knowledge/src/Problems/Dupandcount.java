package Problems;

import java.util.HashMap;

import java.util.Map;


public class Dupandcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s  = new String("GeeksforGeeks");
     char[] ch = s.toCharArray();
     Map<Character, Integer> charcount = new HashMap<Character, Integer>();
     for(int i = 0;i<ch.length;i++) 
     {
     if(charcount.containsKey(ch[i]))
     charcount.put(ch[i], charcount.get(ch[i])+1);
     else
    	 charcount.put(ch[i],1);
     }
     
     System.out.println(charcount);
	
	for(Map.Entry<Character,Integer> entry: charcount.entrySet()) {
		if(entry.getValue()>1)
			System.out.println(entry.getKey()+"-"+entry.getValue());
	}
	
	}
	
}
