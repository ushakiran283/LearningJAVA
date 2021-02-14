package examples;

import java.math.BigDecimal;

public class StudentArrayRunner {

	public static void main(String[] args) {

		int[] marks = { 15, 23, 38, 45 };
		StudentArray student = new StudentArray("ushakiran", marks);

		int number = student.getNumberOfMarks();
		System.out.println("Number of Marks :" + number);

		int sum = student.getSumOfMarks();
		System.out.println("Sum of Marks : " + sum);

		int maximummark = student.getMaximumMark();
		System.out.println("Maximum Marks :" + maximummark);

		int minimummark = student.getMinimumMark();
		System.out.println("Minimum Mark :" + minimummark);

		BigDecimal averagemarks = student.getAverageMarks();
		System.out.println("Average Marks :" + averagemarks);

	}

}
