package collectionsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();
		al.add("mango");
		al.add("goa");
		al.add("apple");
		al.add("grapes");
		System.out.println("Printing list:" + al);

		// Converting to array
		String[] array = al.toArray(new String[al.size()]);
		System.out.println("Printing array:" + Arrays.toString(array));
	}

}
