package collectionsSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		// TreeSet prints elements in sorted order i.e ascending order
		// TreeSet contains unique elements same as like HashSet
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("hello");
		treeset.add("usha");
		treeset.add("sai");
		treeset.add("usha");
		treeset.add("pinki");
		treeset.add("durga");
		System.out.println("Printing treeset:" + treeset); // Priting elements in ascending order
		// Traversing the elements
		Iterator<String> it = treeset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());// Priting elements in ascending order
		}
		System.out.println("********************");
		// Printing elements in descending order
		Iterator<String> it2 = treeset.descendingIterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
