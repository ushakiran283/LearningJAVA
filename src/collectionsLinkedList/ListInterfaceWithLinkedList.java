package collectionsLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceWithLinkedList {

	public static void main(String[] args) {

		List<String> ll = new LinkedList<String>();
		ll.add("usha");
		ll.add("hi");
		ll.add("hello");
		ll.add("usha");

		// System.out.println(ll);
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
