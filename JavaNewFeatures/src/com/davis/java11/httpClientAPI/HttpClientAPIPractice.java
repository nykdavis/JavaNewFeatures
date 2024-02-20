package com.davis.java11.httpClientAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

//import com.sun.tools.javac.jvm.ClassFile.Version;

public class HttpClientAPIPractice {

	public static void main(String[] args) throws IOException, InterruptedException {
		 String url = "https://postman-echo.com/get?uname=davis&pwd=davis";
		 HttpRequest req = HttpRequest.newBuilder()
				 .uri(URI.create(url))
				 .GET()
				 .version(Version.HTTP_2)
				 .build();
		 
		HttpClient client = HttpClient.newBuilder()
				.build();
		
		HttpResponse<String> respons = client.send(req, BodyHandlers.ofString());
        System.out.println(respons.body());
        System.out.println(respons.statusCode());
	}

}
