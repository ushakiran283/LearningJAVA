package examples;

import java.util.ArrayList;

public class ArrayListStudent {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public ArrayListStudent(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	// Print content of the arraylist we use toString()
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkBasedOnIndex(int index) {
		marks.remove(index);
	}

}
