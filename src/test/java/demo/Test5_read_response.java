package demo;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import static io.restassured.path.json.JsonPath.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test5_read_response {

	/**
	 * To get all response as String
	 */
	//@Test
	public void testGetResponseAsString(){
		String responseAsString = get("http://services.groupkt.com/country/search?text=lands").asString();
		System.out.println("My Response:\n\n\n"+responseAsString);
	}
	
	
	

	/**
	 * To get all response as InputStream
	 * @throws IOException 
	 */
	@Test
	public void testGetResponseAsInputStream() throws IOException{
		InputStream stream = get("http://services.groupkt.com/country/get/iso2code/cn").asInputStream(); 
		System.out.println(stream.toString().length());
		stream.close();
	}
	
	
	

	/**
	 * To get all response as ByteArray
	 */
	@Test
	public void testGetResponseAsByteArray(){
		byte[] byteArray = get("http://services.groupkt.com/country/get/iso2code/cn").asByteArray();
		System.out.println(byteArray.length);
	}
	
	
	

	/**
	 * Extract details as String for further calls
	 */
	//@Test
	public void testExtractDetailsForFurtherUse(){
		String href=
		when().
			get("http://jsonplaceholder.typicode.com/photos/1").
		then().
			contentType(ContentType.JSON).
			body("albumId", equalTo(1)).
		extract().
			path("url");
		
		System.out.println(href);
		
		
		when().get(href).then().statusCode(200);
	}
	
	
	

	/**
	 * Extract details as Response for further use
	 */
	//@Test
	public void testExtractDetailsUsingResponse(){
		Response response=
		when().
			get("http://jsonplaceholder.typicode.com/photos/1").
		then().
		extract().
			response();
		
		System.out.println("Content Type: "+response.contentType());
		System.out.println("Href: "+response.path("url"));
		System.out.println("Status Code: "+response.statusCode());
	}
	
	
	
	/**
	 * Extract details as Response for further use
	 */
	//@Test
	public void testJsonPath(){
		Response response=
		when().
			get("http://jsonplaceholder.typicode.com/photos/1").
		then().
		extract().
			response();
		
		System.out.println("Content Type: "+response.contentType());
		System.out.println("Href: "+response.path("url"));
		System.out.println("Status Code: "+response.statusCode());
	}

}
