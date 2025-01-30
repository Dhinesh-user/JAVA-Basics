package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sparse_arrays {

	public static void main(String[] args) {

        String[] strarr = {"ab","abc","abab","ab"};
        String[] qryarr = {"ab","abc"};
		List<String> queries = new ArrayList<String>(Arrays.asList(qryarr));
		List<String> strings = new ArrayList<String>(Arrays.asList(strarr));
		
		Map<String, Integer> re = new HashMap<String,Integer>();
	    List<Integer> result = new ArrayList<Integer>();
	    int s = queries.size();
	    for(String str : strings)
	    re.put(str, re.getOrDefault(str,0)+1);
	    System.out.println(re);
	    
	    for(String q : queries)
	    result.add(re.getOrDefault(q,0));
	    }

	}

	


