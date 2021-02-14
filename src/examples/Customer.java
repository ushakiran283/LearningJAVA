package examples;

public class Customer {

	// state
	private String name;
	private Address homeaddress;

	// Constructor
	public Customer(String name, Address homeaddress) {
		this.name = name;
		this.homeaddress = homeaddress;
	}

	// Behaviour
	public Address getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}

	public String toString() {
		return String.format("name - %s, homeaddress - %s", name, homeaddress);
	}
}
