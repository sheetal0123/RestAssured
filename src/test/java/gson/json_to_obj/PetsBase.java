package gson.json_to_obj;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *  Sinlge placeholder class is required which hold all the POJOs data
 *  Create POJOs using http://www.jsonschema2pojo.org
 * @author Sheetal_Singh
 */
public class PetsBase {

	@SerializedName("Pet1")
	@Expose
	private List<Pet1> pet1 = null;
	@SerializedName("Pet2")
	@Expose
	private List<Pet2> pet2 = null;
	@SerializedName("Pet3Robo")
	@Expose
	private List<Pet3Robo> pet3Robo = null;

	public List<Pet1> getPet1() {
		return pet1;
	}

	public void setPet1(List<Pet1> pet1) {
		this.pet1 = pet1;
	}

	public List<Pet2> getPet2() {
		return pet2;
	}

	public void setPet2(List<Pet2> pet2) {
		this.pet2 = pet2;
	}

	public List<Pet3Robo> getPet3Robo() {
		return pet3Robo;
	}

	public void setPet3Robo(List<Pet3Robo> pet3Robo) {
		this.pet3Robo = pet3Robo;
	}

	@Override
	public String toString() {
		return "PetsBase [pet1=" + pet1 + ", pet2=" + pet2 + ", pet3Robo=" + pet3Robo + "]";
	}

	
	
}