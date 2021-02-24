package collectionsLinkedList;

import java.util.LinkedList;
import java.util.List;

public class BookRunner {

	public static void main(String[] args) {

		Book b1 = new Book(23, 234, "java", "arjun", "vip");
		Book b2 = new Book(3, 24, "core java", "vinodh", "viadasdp");
		Book b3 = new Book(23, 334, "c", "durga", "xxxxx");

		List<Book> ll = new LinkedList<Book>();
		ll.add(b1);
		ll.add(b2);
		ll.add(b3);

		for (Book b : ll) {
			System.out.println(b.getId() + " " + b.getName() + " " + b.getAuthor() + " " + b.getPublisher() + " "
					+ b.getQuantity());
		}
	}

}
