package APITesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DeleteEx {
	
//	URL from website - http://dummy.restapiexample.com/
//	Only changes are 
//	change in URL
//	change in RequestType
//	jsonbody and write methods are not required
//	Remaining are same

	public void delete() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/delete/2");
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("Delete");
		con.connect();
		con.setRequestProperty("Content-Type", "application/json");
		con.setDoOutput(true);
		
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
			DeleteEx d = new DeleteEx();
			d.delete();
			}

}
