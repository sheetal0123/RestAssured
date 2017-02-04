package demo;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test3_schema_check {

	
	
	/**
	 * verify response type
	 */
	@Test
	public void test() {
	
	given().
		get("http://services.groupkt.com/country/get/iso2code/cn").
	then().
		statusCode(200).
		contentType(ContentType.JSON);
		//contentType(ContentType.HTML);
		//contentType(ContentType.XML);
	}
	
	
	
	
	/**
	 * This test will verify the response schema with predefined existing schema
	 * path: src/test/resources/geo-schema.json
	 * 
	 * @todo
	 * issue: in existing schema,values can be given as anything like blank,
	 * string, int, double it should validate string, double separately
	 */
	//@Test
	public void testSchema() {

		given().get("http://geo.groupkt.com/ip/172.217.4.14/json").then().assertThat()
				.body(matchesJsonSchemaInClasspath("geo-schema.json"));

	}

	
	
	
}
