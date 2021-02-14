package examples;

public class BookRunner {

	public static void main(String[] args) {

		// Create 3 instances art of programming, effective java, clean code
		Book ArtOfProgramming = new Book();
		Book EffeciveJava = new Book();
		Book CleanCode = new Book();

		EffeciveJava.Opened();
		ArtOfProgramming.setNoOfCopies(32);
		System.out.println("Art of programming book has :" + ArtOfProgramming.getNoOfCopies());
	}

}
