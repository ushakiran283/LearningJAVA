package collectionsSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		// LinkedHashSet maintains insertion order & contains unique elements like
		// HashSet
		Set<String> linkedhashset = new LinkedHashSet<String>();
		linkedhashset.add("sai");
		linkedhashset.add("durga");
		linkedhashset.add("pinki");
		linkedhashset.add("usha");
		linkedhashset.add("durga");
		System.out.println("Printing linkedhashset:" + linkedhashset);

		Set<String> linkedhashset2 = new LinkedHashSet<String>();

		linkedhashset2.add("hello");
		linkedhashset2.add("hi");
		linkedhashset2.add("hello");
		linkedhashset.addAll(linkedhashset2);
		System.out.println("Printing linkedhashset after adding few elements:" + linkedhashset);

	}
}
