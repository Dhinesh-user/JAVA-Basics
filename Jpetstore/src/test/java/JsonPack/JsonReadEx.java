package JsonPack;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadEx {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jp = new JSONParser();
		FileReader f = new FileReader("C:\\Users\\PD20313015\\eclipse-workspace\\Jpetstore\\src\\test\\java\\JsonPack\\jsonfile.json");
		
		Object obj = jp.parse(f);
		JSONObject jo = (JSONObject) obj;
		
		String name = (String) jo.get("name");
		Long age = (Long) jo.get("age");
		
		JSONArray ja = (JSONArray) jo.get("Special");
		
		Iterator itr = ja.iterator();
		while(itr.hasNext()) {
			System.out.println("Special:"+itr.next());}
		System.out.println(name+ " "+ age);
		}
		
		
				
	}


