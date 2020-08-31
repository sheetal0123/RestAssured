package jackson.features;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * Web URL -> JsonNode 
 * 
 * @author Sheetal_Singh
 */
public class JsonUrl {
	public static JsonNode getJsonNodeFromURL() throws IOException {
		URL url = new URL("https://game-of-thrones-quotes.herokuapp.com/v1/random");
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readValue(url, JsonNode.class);
		return jsonNode;
				
	}

	public static void main(String[] args) throws IOException {
		System.out.println("JSON URL Eg");
		JsonNode jsonNode = getJsonNodeFromURL();
		System.out.println(">>"+jsonNode.path("sentence"));
		System.out.println(">>"+jsonNode.get("sentence").asText());
		
		JsonNode nameNode =jsonNode.get("character");
		System.out.println(">>>"+nameNode.get("name").asText());
	}

}
