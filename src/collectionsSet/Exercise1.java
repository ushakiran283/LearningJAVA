package collectionsSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercise1 {

	public static void main(String[] args) {

		List<Character> list = new LinkedList<Character>();
		list.add('A');
		list.add('R');
		list.add('C');
		list.add('Z');
		list.add('R');
		list.add('C');
		list.add('B');
		System.out.println("LinkedList:" + list);// printing the list

		Set<Character> treeset = new TreeSet<Character>(list);
		System.out.println("TreeSet:" + treeset); // Prints in sorted manner

		Set<Character> linkedhashset = new LinkedHashSet<Character>(list);
		System.out.println("LinkedHashSet:" + linkedhashset);// Elements are printed in the insertion order

		Set<Character> hashset = new HashSet<Character>(list);
		System.out.println("HashSet:" + hashset); // If u don't care about insertion and sorted order we go for hashSet

	}

}
