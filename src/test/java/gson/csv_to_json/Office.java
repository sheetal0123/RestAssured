package gson.csv_to_json;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Office {

    private OfficeA officeA;
    private OfficeB officeB;

    public OfficeA getOfficeA() {
        return officeA;
    }

    public void setOfficeA(OfficeA officeA) {
        this.officeA = officeA;
    }

    public OfficeB getOfficeB() {
        return officeB;
    }

    public void setOfficeB(OfficeB officeB) {
        this.officeB = officeB;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("officeA", officeA).append("officeB", officeB).toString();
    }

}
