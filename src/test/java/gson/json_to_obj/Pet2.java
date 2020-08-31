package gson.json_to_obj;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Pet2 {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("category")
	@Expose
	private String category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Pet2 [name=" + name + ", category=" + category + "]";
	}
	
}
