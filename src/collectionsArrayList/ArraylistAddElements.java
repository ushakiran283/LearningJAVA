package collectionsArrayList;

import java.util.ArrayList;

public class ArraylistAddElements {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("usha");
		al.add("durga");
		System.out.println("list of elements:" + al);

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("pinki");
		al1.add("sai");

		al.addAll(al1);// adding 2nd list elements to 1st list
		System.out.println("Adding al1 elements to al:" + al);

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("arjun");
		al2.add("vinodhini");
		al.addAll(1, al2);

		System.out.println("Adding al2 elements to al with specific index:" + al);

	}

}
