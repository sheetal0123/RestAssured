package gson.json_to_obj;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pet3Robo {

	@SerializedName("surname")
	@Expose
	private String surname;
	@SerializedName("category")
	@Expose
	private String category;
	@SerializedName("hp")
	@Expose
	private String hp;

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Pet3Robo [surname=" + surname + ", category=" + category + ", hp=" + hp + "]";
	}
	
}
