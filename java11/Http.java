package java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Http {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://httpbin.org/get")).GET().build();
       HttpResponse<Void>response=client.send(request, HttpResponse.BodyHandlers.discarding());
       System.out.println(response.statusCode());
	}

}
