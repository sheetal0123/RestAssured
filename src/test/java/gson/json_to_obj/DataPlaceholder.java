package gson.json_to_obj;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataPlaceholder {
	@SerializedName("Data")
	@Expose
	private List<Data> data = null;

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DataPlaceholder [data=" + data + "]";
	}
	
}
