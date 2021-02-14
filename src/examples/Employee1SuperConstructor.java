package examples;

public class Employee1SuperConstructor extends PersonDetails {

	// state
	private String title;
	private char employergrade;
	private String company;

	// Constructor
	Employee1SuperConstructor(String employername, String email, long phonenumber, String title, char employergrade, String company) {
		super(employername, email, phonenumber);
		this.title = title;
		this.employergrade = employergrade;
		this.company = company;
	}

	// Behavior
	public String getTitle() {
		return title;
	}

	public char getEmployergrade() {
		return employergrade;
	}

	public String getCompany() {
		return company;
	}

	public String toString() {
		return title + "," + employergrade + "," + company + "," + super.toString();
	}
}
