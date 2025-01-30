package JsonPack;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriteEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		JSONObject js = new JSONObject();
		js.put("name", "DK");
		js.put("age",21);
		 
		JSONArray  arr = new JSONArray();
		arr.add("smile");
		arr.add("eyes");
		
		js.put("Special", arr);
		
		FileWriter f = new FileWriter("C:\\Users\\PD20313015\\eclipse-workspace\\Jpetstore\\src\\test\\java\\JsonPack\\jsonfile.json");
		f.write(js.toJSONString());
//		f.write(js.toString());
		f.close();
		

	}

}
