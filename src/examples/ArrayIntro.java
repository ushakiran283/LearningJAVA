package examples;

import java.util.Arrays;

public class ArrayIntro {

	public static void main(String[] args) {

		int[] marks = { 10, 20, 30, 40, 50, 60, 70, 80 };
		System.out.println("Content of the Array :" + Arrays.toString(marks));// Content of the array use
																				// "Arrays.toString" static method
		System.out.println("Index of the array :" + marks[3]);// Print particular mark we should mention the index
																// number
		System.out.println("Length of the array :" + marks.length); // print the length of the marks. we use length
																	// property
		// Using for-loop
		/*
		 * for (int i = 0; i < marks.length; i++) { System.out.println(marks[i]); }
		 */

		// Using for-each loop
		for (int mark : marks) {
			System.out.println(mark);
		}
	}

}
