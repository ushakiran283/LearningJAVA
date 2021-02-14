package examples;

import java.util.Arrays;

public class ArraysExamples {

	public static void main(String[] args) {
		// Verify equality of arrays
		int[] a = { 12, 16, 23, 45 };
		int[] b = { 12, 16, 23, 45 };
		// print content of the arrays
		System.out.println("First array :" + Arrays.toString(a));
		System.out.println("Second array :" + Arrays.toString(b));
		// Verify using equals
		boolean equal = Arrays.equals(a, b);
		System.out.println(equal);
	}

}
