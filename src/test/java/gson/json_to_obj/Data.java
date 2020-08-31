package gson.json_to_obj;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
	@SerializedName("photoId")
	@Expose
	private String photoId;
	@SerializedName("category")
	@Expose
	private String category;

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Data [photoId=" + photoId + ", category=" + category + "]";
	}
	
	
}
