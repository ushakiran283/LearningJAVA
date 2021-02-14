package examples;

public class Book {

	// State
	private int noOfCopies;

	// Method / Behaviour
	public void setNoOfCopies(int noofcopies) {
		this.noOfCopies = noofcopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	void Opened() {
		System.out.println("Book is opened");
	}
}
