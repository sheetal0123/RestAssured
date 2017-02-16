package demo;

import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;


/**
 * We can defined few mandatory check in ResponseSpecBuilder
 * 
 * then it can be used in multiple test
 * 
 * @author sheetalsingh
 *
 */
public class Test12_ResponseSpecBuilder {
	
	ResponseSpecification responseSpec;
	
	@BeforeClass
	public void setup(){
		ResponseSpecBuilder builder = new ResponseSpecBuilder();
		builder.expectStatusCode(200);
		builder.expectHeader("Content-Encoding", "gzip");
		responseSpec = builder.build();
	}
	
	@Test
	public void testResponse1(){
		when().
		       get("http://services.groupkt.com/country/get/iso2code/in").
		then().
		       spec(responseSpec);
	}
	
	
	@Test
	public void testResponse2(){
		when().
		       get("http://services.groupkt.com/country/get/iso2code/cn").
		then().
		       spec(responseSpec);
	}
	
}


























