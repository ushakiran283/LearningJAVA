package examples;

public class Student extends Person {

	// state
	private String collegename;
	private int year;

	// Behavior
	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
