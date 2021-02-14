package examples;

import java.util.ArrayList;

public class Bookclass {

	private int id;
	private String name;
	private String author;
	private ArrayList<Reviewsclass> reviews = new ArrayList<>();

	public Bookclass(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public String toString() {
		return String.format("id - %d, name - %s ,author - %s, Reviews - %s", id, name, author, reviews);
	}

	public void addReview(Reviewsclass review) {
		this.reviews.add(review);

	}

}
