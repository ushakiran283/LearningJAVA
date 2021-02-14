package examples;

public class Persondetatils {

	// state
	private String name;
	private long phonenumber;
	private String email;

	// Behavior
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return email + "," + phonenumber;
	}

}
