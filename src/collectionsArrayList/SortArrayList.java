package collectionsArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("usha");
		list.add("kiran");
		list.add("durga");
		list.add("pinki");
		list.add("sai");
		for (String al : list) {
			System.out.println("Before Sorting:" + al); // printing unsorted list
		}
		System.out.println("********************");

		list.remove(2);
		System.out.println(list);

		Collections.sort(list); // Sorting arraylist in ascending order
		for (String al : list) {
			System.out.println("After Sorting:" + al); // printing sorted list
		}
		System.out.println("********************");

		Collections.sort(list, Collections.reverseOrder()); // Sort arraylist in descending order
		for (String al : list) {
			System.out.println("Reverse order Sorting:" + al); // printing reverse sorted list
		}
	}
}
