package jackson.features;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

/**
 * 
 * Json File -> JsonNode 
 * 
 * Reading values from Json without using POJOs
 * JsonArray, NestedJson
 * 
 * Can be used for reading properties, test data etc
 * 
 * @author Sheetal_Singh
 */
public class JsonNodeEg {
	static ObjectMapper objMapper = new ObjectMapper();

	public static void main(String[] args) throws IOException {
		String jsonFile = "./src/test/java/jackson/features/users.json";
		JsonNode jsonNode = objMapper.readTree(new File(jsonFile));

		// Reading json node
		JsonNode nodeBob = jsonNode.get("Bob");
		String firstName = nodeBob.get("firstname").asText();
		String age = nodeBob.get("age").asText();
		System.out.println("FN: " + firstName);
		System.out.println("Age: " + age);

		// Reading nested json node {}
		JsonNode addressNode = nodeBob.get("address");
		String hNo = addressNode.get("hno").asText();
		System.out.println("HNo:" + hNo);

		// Reading nested json array [] - using get(index)
		JsonNode skillsNode = nodeBob.get("skills");
		String s1 = skillsNode.get(2).asText();
		System.out.println("s1:" + s1);

		// Reading nested json array [] - using ArrayNode
		ArrayNode arraySkillsNode = (ArrayNode) nodeBob.get("skills");
		if (arraySkillsNode.isArray()) {
			for (JsonNode value : arraySkillsNode) {
				String val = value.asText();
				System.out.println(val);
			}
		}

	}

}
