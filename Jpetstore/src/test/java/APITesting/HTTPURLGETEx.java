package APITesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPURLGETEx {
	
//	URL from this website - http://dummy.restapiexample.com/
//	URL from website - https://reqres.in/

	public void GetEx() throws IOException {
//		URL url = new URL("https://dummyapi.online/api/social-profiles");
		URL url = new URL("https://reqres.in/api/unknown/2");

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int status = connection.getResponseCode();
		System.out.println("Status Code is "+status);
		
		String message = connection.getResponseMessage();
		System.out.println("Message is "+connection);
		
		InputStream ips = connection.getInputStream();
		InputStreamReader ipsr = new InputStreamReader(ips);
		BufferedReader br = new BufferedReader(ipsr);
		
		String line;
		StringBuffer sb = new StringBuffer();
		while((line = br.readLine())!=null) {
			sb.append(line);
		}
		System.out.println(sb);
	}
	
	public static void main (String[] args) throws IOException {
		HTTPURLGETEx httpex = new HTTPURLGETEx();
		httpex.GetEx();
	}
}
