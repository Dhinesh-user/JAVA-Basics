package APITesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.collections4.Get;

public class POSTURLEx {

	
//	URL from this website - http://dummy.restapiexample.com/
	
	public void postEx() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("POST");
		con.connect();
		con.setRequestProperty("Content-Type", "application/json");
		con.setDoOutput(true);
		String jsonbody= "	{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
		byte[] arr = jsonbody.getBytes();
		OutputStream opts = con.getOutputStream();
		opts.write(arr);
	    System.out.println("StatusCode: "+con.getResponseCode());
	    System.out.println("StatusMessage: "+con.getResponseMessage());
	    
	    InputStream ips = con.getInputStream();
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
		POSTURLEx httpex = new POSTURLEx();
		httpex.postEx();
	}
}
