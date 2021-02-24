package collectionsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoList {

	public static void main(String[] args) {

		String[] fruits = { "orange", "apple", "goa", "mango" };// creating array
		System.out.println("Printing array:" + Arrays.toString(fruits));
		// Converting array to list
		List<String> list = new ArrayList<String>();
		for (String fruit : fruits) {
			list.add(fruit);
		}
		System.out.println("Printing list:" + list);

	}

}
