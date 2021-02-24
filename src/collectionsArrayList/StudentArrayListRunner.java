package collectionsArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayListRunner {

	public static void main(String[] args) {

		StudentArrayList s1 = new StudentArrayList(37, "ushakiran", 30);
		StudentArrayList s2 = new StudentArrayList(32, "poojitha", 18);
		StudentArrayList s3 = new StudentArrayList(36, "dushyanth", 17);

		/*
		 * System.out.println(s1.getRollno() + " " + s1.getName() + " " + s1.getAge());
		 * System.out.println(s2.getRollno() + " " + s2.getName() + " " + s2.getAge());
		 * System.out.println(s3.getRollno() + " " + s3.getName() + " " + s3.getAge());
		 */

		// instead of printing student by student details, we can create arraylist.
		// Add student details one by one to the list and loop them
		ArrayList<StudentArrayList> al = new ArrayList<StudentArrayList>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator<StudentArrayList> it = al.iterator();
		while (it.hasNext()) {
			StudentArrayList st = (StudentArrayList) it.next();
			System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
		}
	}

}
