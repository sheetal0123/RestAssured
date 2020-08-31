package gson.json_to_obj;

import java.math.BigDecimal;
import java.util.List;

public class Director {
	
	private String ID;
	private String Name;
	private String Position;
	private BigDecimal Salary;
	private String Dept;
	private String Location;
	private List<String> Skills;
	private String Country;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public BigDecimal getSalary() {
		return Salary;
	}
	public void setSalary(BigDecimal salary) {
		Salary = salary;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public List<String> getSkills() {
		return Skills;
	}
	public void setSkills(List<String> skills) {
		Skills = skills;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	@Override
	public String toString() {
		return "DirectorPojo [ID=" + ID + ", Name=" + Name + ", Position="
				+ Position + ", Salary=" + Salary + ", Dept=" + Dept
				+ ", Location=" + Location + ", Skills=" + Skills
				+ ", Country=" + Country + "]";
	}
}
