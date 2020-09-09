package tp.demo.mvc;

public class Address {
	private String country;
	private String city;
	private String street;
	private String pincode;
	
	public Address(String country, String city, String street, String pincode) {
		super();
		this.country = country;
		this.city = city;
		this.street = street;
		this.pincode = pincode;
	}

	public Address() {
		super();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
