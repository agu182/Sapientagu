package genericprac;

import java.io.Serializable;

public class Address implements Serializable {
	private static final long serialVersionUID=1L;     //to maintain versionhs of class state
	String street,country;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new StringBuffer("Street: ")
		.append(this.street)
		.append("country: ").append(this.country).toString();
	}
	

}
