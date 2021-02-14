package examples;

public class PersonDetails {

	// state
	private String employername;
	private String email;
	private long phonenumber;

	PersonDetails(String employername, String email, long phonenumber) {
		this.employername = employername;
		this.email = email;
		this.phonenumber = phonenumber;
	}

	// Behavior
	public String getEmployername() {
		return employername;
	}

	public String getEmail() {
		return email;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public String toString() {
		return employername + "," + email + "," + phonenumber;
	}
}
