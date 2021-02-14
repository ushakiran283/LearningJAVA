package examples;

public class Employee extends Persondetatils {

	// state
	private String title;
	private String employername;
	private char employeegrade;
	private int salary;

	// Behavior
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employername;
	}

	public void setEmployer(String employer) {
		this.employername = employer;
	}

	public char getEmployeegrade() {
		return employeegrade;
	}

	public void setEmployeegrade(char employeegrade) {
		this.employeegrade = employeegrade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return title + "," + employername + "," + employeegrade + "," + super.toString();
	}
}
