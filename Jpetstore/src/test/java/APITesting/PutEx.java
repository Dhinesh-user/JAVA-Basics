package APITesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;

import java.net.URL;

public class PutEx {
	
//	URL from website - http://dummy.restapiexample.com/
//	Only changes are 
//	change in URL
//	change in RequestType
//	change in jsonBody(Updated details)
//	Remaining are same
	
	public void put() throws IOException {
	URL url = new URL("	https://dummy.restapiexample.com/api/v1/update/21");
	HttpURLConnection con = (HttpURLConnection)url.openConnection();
	con.setRequestMethod("PUT");
	con.connect();
	con.setRequestProperty("Content-Type", "application/json");
	con.setDoOutput(true);
	String jsonbody= "	{\"name\":\"test\",\"salary\":\"123\",\"age\":\"25\"}";
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
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PutEx p = new PutEx();
		p.put();
		}

}
