package learning;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> obj = new ArrayList<String>();
		obj.add("usha");
		obj.add("pinki");
		obj.add("sai");
		obj.add("durga");

		// print the array
		System.out.println(obj);

		// sort the array and print [we can use sort() method in collections class].
		/*
		 * for (String s : obj) { System.out.println(s); }
		 */
		// u can use foreach or streams concept
		obj.stream().sorted().forEach(s -> System.out.println(s));
	}

}
