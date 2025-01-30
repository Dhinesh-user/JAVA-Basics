package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListofMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> listOfMaps = new ArrayList<>();
		Map<String, Object> Dev = new HashMap<>();
		Dev.put("name", "Jack");
		Dev.put("age", 30);
		listOfMaps.add(Dev);

		Map<String, Object> Tester = new HashMap<>();
		Tester.put("name", "Jones");
		Tester.put("age", 25);
		listOfMaps.add(Tester);
		
		for (Map<String, Object> map : listOfMaps) {
		    for (Map.Entry<String, Object> entry : map.entrySet()) {
		        String key = entry.getKey();
		        Object value = entry.getValue();
		        System.out.format("%s: %s\n", key, value);
		    }
		}
	
		System.out.println(listOfMaps.get(0));
	}

}
