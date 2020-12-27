package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

// uri-------------properties 
public class HTTPMethods {
	
	Properties pr;
	public HTTPMethods(Properties pr) 
	{
	this.pr=pr;
	}
	
	
	public Response postRequest(String body,String uriKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post(pr.getProperty(uriKey));
		
		return res;
	}
	
	
	public Response GetRequest(String uriKey,String idValue)
	{
		String uri=pr.getProperty(uriKey)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		return res;
	}
	
	public Response GetRequest(String uriKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(uriKey));
		
		return res;
	}
	
	public Response putRequest(String body,String uriKey,String idValue)
	{
		String uri=pr.getProperty(uriKey)+"/"+idValue;
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.put(pr.getProperty(uri));
		
		return res;
		
	}
	

}
