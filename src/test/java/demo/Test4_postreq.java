package demo;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Test4_postreq {

	/**
	 * post request reference:
	 * http://thomas-bayer.com/restgate/index.do?URL=http://www.thomas-bayer.com/restnames/countries.groovy&httpMethod=POST
	 */
	@Test
	public void testPostReq1(){
		
		given().
			param("firstName","hello world").
		when().
			//post("http://thomas-bayer.com/restgate/index.do?URL=http://www.thomas-bayer.com/restnames/countries.groovy&httpMethod=POST").
			post("http://www.thomas-bayer.com/restnames/countries.groovy").
		then().
			statusCode(200).log().all();
			//.body("restnames.countries.country", equalTo("Great Britain"));
		
		
			
		
	}
}
