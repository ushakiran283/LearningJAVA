package examples;

public class BookRunnerComposition {

	public static void main(String[] args) {

		Bookclass book = new Bookclass(12, "Learn Java", "durga");

		// Using arraylist
		book.addReview(new Reviewsclass(30, "Awesome Book", 4));
		book.addReview(new Reviewsclass(12, "Good Book", 5));

		System.out.println(book);

	}

}
