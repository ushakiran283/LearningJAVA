package collectionsArrayList;

import java.util.ArrayList;

public class BookRunner {

	public static void main(String[] args) {

		BookExampleUsingArrayList book = new BookExampleUsingArrayList(3, 32, "Learn Java", "rahul", "vip");
		BookExampleUsingArrayList book2 = new BookExampleUsingArrayList(4, 332, "Java", "durga", "Graw");
		BookExampleUsingArrayList book3 = new BookExampleUsingArrayList(6, 132, "Core Java", "Shetty", "BPB");

		ArrayList<BookExampleUsingArrayList> al = new ArrayList<BookExampleUsingArrayList>();
		al.add(book);
		al.add(book2);
		al.add(book3);

		for (BookExampleUsingArrayList books : al) {

			System.out.println(books.getId() + " " + books.getName() + " " + books.getQuantity() + " "
					+ books.getAuthor() + " " + books.getPublisher());

			/*
			 * System.out.println( books.id + " " + books.author + " " + books.name + " " +
			 * books.publisher + " " + books.quantity);
			 */
		}

	}

}
