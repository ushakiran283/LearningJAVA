package examples;

public class Address {

	private String line;
	private String city;
	private String zipcode;

	public Address(String line, String city, String zipcode) {
		this.line = line;
		this.city = city;
		this.zipcode = zipcode;
	}

	// Print the content of the homeaddress
	public String toString() {
		return line + "," + city + " ," + zipcode;
	}

}
