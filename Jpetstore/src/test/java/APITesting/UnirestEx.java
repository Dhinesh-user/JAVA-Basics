package APITesting;

import com.mashape.unirest.http.HttpResponse;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestEx {

	
	public static void GetEx() throws UnirestException  {
		HttpResponse<JsonNode> jr = Unirest.
				get("https://dummyapi.online/api/social-profiles").asJson();
		
		System.out.println("Status Code: "+ jr.getStatus());
		System.out.println("Status Message: "+ jr.getStatusText());
		System.out.println("Response Body: "+ jr.getBody());
		}
	
	public static void PostEx() throws UnirestException  {
		HttpResponse<JsonNode> jr = Unirest.
				post("https://dummy.restapiexample.com/api/v1/create").body("{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}").asJson();
		
		System.out.println("Status Code: "+ jr.getStatus());
		System.out.println("Status Message: "+ jr.getStatusText());
		System.out.println("Response Body: "+ jr.getBody());
		}
	public static void PutEx() throws UnirestException  {
		HttpResponse<JsonNode> jr = Unirest.
				put("https://dummy.restapiexample.com/api/v1/update/21").body("{\"name\":\"test\",\"salary\":\"210\",\"age\":\"25\"}").asJson();
		
		System.out.println("Status Code: "+ jr.getStatus());
		System.out.println("Status Message: "+ jr.getStatusText());
		System.out.println("Response Body: "+ jr.getBody());
		}
	public static void DeleteEx() throws UnirestException  {
		HttpResponse<JsonNode> jr = Unirest.
			delete("https://dummy.restapiexample.com/api/v1/update/21").asJson();
		System.out.println("Status Code: "+ jr.getStatus());
		System.out.println("Status Message: "+ jr.getStatusText());
		System.out.println("Response Body: "+ jr.getBody());
		}
	public static void main(String[] args) throws UnirestException {
		GetEx();
		PostEx();
		PutEx();
		DeleteEx();
	}

}
