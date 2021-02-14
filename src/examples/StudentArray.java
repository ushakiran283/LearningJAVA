package examples;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StudentArray {

	private String name;
	private int[] marks;

	public StudentArray(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getNumberOfMarks() {
		return marks.length;
	}

	public int getMaximumMark() {
		// int maximum = 0;// 10, 20, 30, 40 u can use below Integer.Minvalue
		int maximum = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;

	}

	public int getMinimumMark() {
		// int minimum = 0;// 10, 20, 30, 40 or u can use below Integer.Minvalue
		int minimum = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minimum) {
				minimum = mark;
			}
		}
		return minimum;
	}

	public BigDecimal getAverageMarks() {
		int sum = getSumOfMarks();
		int total = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(total), 3, RoundingMode.UP);
	}

}
