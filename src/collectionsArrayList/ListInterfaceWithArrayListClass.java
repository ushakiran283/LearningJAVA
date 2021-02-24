package collectionsArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterfaceWithArrayListClass {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(); // creating arraylist
		list.add("usha"); // creating object in arraylist
		list.add("durga");
		list.add("pinki");
		list.add("sai");
		list.add("durga");
		// System.out.println(list);
		/*
		 * Iterating ArrayList using Iterator Iterator<String> it = list.iterator();//
		 * traverse ArrayList elements using the Iterator interface while (it.hasNext())
		 * {// check if the iterator has the elements System.out.println(it.next());//
		 * printing the element and move to next }
		 */

		System.out.println("Returning the element at specific index:" + list.get(1)); // accessing the element
		list.set(1, "kiran"); // changing the element

		Collections.sort(list);// sorting the list

		/*
		 * // Iterating ArrayList using For-each loop for (String li : list) {
		 * System.out.println(li); }
		 */

		//// Iterating ArrayList using For-loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
