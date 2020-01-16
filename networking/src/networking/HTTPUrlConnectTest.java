package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPUrlConnectTest {

	private URL url = null;
	private HttpURLConnection con = null;
	
	public HTTPUrlConnectTest(String urlStr) {
		try {
			url = new URL(urlStr);
			con = (HttpURLConnection) url.openConnection();
		} catch (MalformedURLException e) {
				e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	public int sendGetRequest() throws IOException {
	
	con.setRequestMethod("GET");
	con.setRequestProperty("User-Agent", "Mozilla/5.0");
	
	System.out.println("Sending get to url" +url);
	
	return con.getResponseCode();
	}
	
	public String getResponse() throws IOException {
		
		BufferedReader inBuf = new BufferedReader(new InputStreamReader(con.getInputStream()));
	
		String inLine;
		StringBuffer sb = new StringBuffer();
	
				
		while ((inLine = inBuf.readLine()) != null) {
			sb.append(inLine);
		}
		inBuf.close();
	
		return sb.toString();	
	}
	
	public static void main(String[] args) throws IOException {
		HTTPUrlConnectTest httpCon = new HTTPUrlConnectTest("http://www.google.com/search?q=dog");
		int respCode = httpCon.sendGetRequest();
		System.out.println("\n >>> GET Response code is" + respCode);
		System.out.println("\n >>> Response strng is" );
		String resp = httpCon.getResponse();
		System.out.println(resp);
	}
		
}
	