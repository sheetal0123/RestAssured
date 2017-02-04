package demo;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test1_basics_json {

	/**
	 * it will verify code and print complete response in console
	 */
	//@Test
	public void test1() {
		given().
			get("http://services.groupkt.com/country/get/iso2code/cn").
		then().
			statusCode(200).log().all();
	}

	
	/**
	 * simply checking status code
	 */
	//@Test
	public void test2() {
		given().get("http://jsonplaceholder.typicode.com/posts/3").then().statusCode(200);
	}


	/**
	 * verifying single content using org.hamcrest.Matchers library's equalTo method
	 */
	//@Test
	public void test3() {
		given().get("http://services.groupkt.com/country/get/iso2code/cn").then().body("RestResponse.result.name",equalTo("China"));
	}
	
	
	/**
	 * verifying multiple content using org.hamcrest.Matchers library
	 */
	//@Test
	public void test4() {
		given().
			get("http://services.groupkt.com/country/get/all").
		then().
			body("RestResponse.result.name",hasItems("Afghanistan","Argentina","Australia"));
	}
	
	
	/**
	 * parameters and headers can be set
	 */
	//@Test
	public void test5() {
		given().
			param("key1", "value1").
			header("key2", "value2").
		when().
			get("http://services.groupkt.com/country/get/iso2code/cn").
		then().
			statusCode(200).log().all();
	}

	

	/**
	 * using 'and' to increase readability 
	 * generally used when writing in one line xpath style
	 */
	//@Test
	public void test6() {
		given().param("key1", "value1").and().header("key2", "value2").when().get("http://services.groupkt.com/country/get/iso2code/cn").then().statusCode(200).and().body("RestResponse.result.alpha3_code", equalTo("CHN"));
	}


	/**
	 * parameters and headers can be set
	 */
	@Test
	public void testHeadersParameters() {
		int statuscode = 401;
		
		given().
			headers("Appkey", "9336244a-2a0c-4e50-bfaf-fabba2e7134e").
			headers("Password", "deepak@123").
			param("Wfsemail","deepak@gmail.com").
		when().
			get(" https://api.fonts.com/rest/xml/Accounts/").
		then().
			statusCode(statuscode).log().all();
	}
	
		
}
