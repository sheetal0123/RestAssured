package gson.csv_to_json;
import org.apache.commons.lang.builder.ToStringBuilder;

public class AddressGeo {

    private String lattitude;
    private String longitude;

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lattitude", lattitude).append("longitude", longitude).toString();
    }

}
