package collectionsSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> hashset = new HashSet<String>();
		hashset.add("usha");
		hashset.add("kiran");
		hashset.add("sai");
		hashset.add("usha");
		hashset.add("kiran");
		hashset.add("sai");
		hashset.add("pinki");
		System.out.println(hashset);

		hashset.remove("sai");
		System.out.println(hashset); // remove element sai

		Set<String> hashset2 = new HashSet<String>();
		hashset.add("durga");
		hashset.add("prasad");
		hashset.addAll(hashset2);
		System.out.println(hashset);

		Iterator<String> it = hashset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
