package gson.csv_to_json;

import org.apache.commons.lang.builder.ToStringBuilder;

public class OfficeB {

    private String name;
    private String client;
    private String teamsize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getTeamsize() {
        return teamsize;
    }

    public void setTeamsize(String teamsize) {
        this.teamsize = teamsize;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("client", client).append("teamsize", teamsize).toString();
    }

}
