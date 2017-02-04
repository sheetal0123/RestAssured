package demo;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Test2 {

	@BeforeClass
	public void setup() {
		RestAssured.baseURI = "http://services.groupkt.com";
		RestAssured.basePath = "/country";
		// RestAssured.port = 8080;
	}
	

	/**
	 * Here we need to get only end points, as baseuri and basepath will be
	 * picked from BeforeClass
	 */
	@Test
	public void test1() {
		given().get("/get/iso2code/in").then().statusCode(200).log().all();
	}

}
