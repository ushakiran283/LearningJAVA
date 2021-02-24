package collectionsSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetFromAnotherCollection {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("usha");
		list.add("pinki");
		list.add("sai");
		list.add("pinki");
		System.out.println("Printing ArrayList:" + list);

		Set<String> hashset = new HashSet<String>(list);
		hashset.add("durga");
		hashset.add("arjun");
		System.out.println("Printing hashset:" + hashset);// prints unique elements
	}

}
