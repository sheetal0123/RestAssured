package demo;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import static io.restassured.path.json.JsonPath.*;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class Test7_XmlPath {

	
	/**
	 * todo: Need to change url
	 */
	@Test
	public void todo(){
		String xml = post("/greetXML?firstName=John&lastName=Doe").andReturn().asString();
		String firstName1 = from(xml).get("greeting.firstName");
		String lastName1 = from(xml).get("greeting.firstName");

		// or a bit more efficiently:
		XmlPath xmlPath = new XmlPath(xml).setRoot("greeting");
		String firstName2 = xmlPath.get("firstName");
		String lastName2 = xmlPath.get("lastName");
	}
}
