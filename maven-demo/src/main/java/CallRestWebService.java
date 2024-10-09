import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
/** @author Walid-YAICH */
public class CallRestWebService {
public static final String endpoint = "https://httpbin.org/get";
public static void main(String[] args) {
HttpClient client = new DefaultHttpClient();
HttpGet request = new HttpGet(endpoint);
String ip = "not found"; 
try {
HttpResponse response = client.execute(request);
String jsonResponse = EntityUtils.toString(response.getEntity());
System.out.println("Response as String : " + jsonResponse);
JSONObject responseObj = new JSONObject(jsonResponse);
ip = responseObj.getString("origin");
System.out.println("ip : " + ip);
} catch (IOException e) { e.printStackTrace(); }
}
}