package learning;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] obj = { 1, 3, 4, 6, 4 };
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}

		System.out.println("--------------");
		for (int i = obj.length - 1; i >= 0; i--) {
			System.out.println(obj[i]);
		}

		System.out.println("....................");

		String[] names = { "hello", "good", "one", "two" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println(".......................");
		for (int i = names.length - 1; i >= 0; i--) {
			System.out.println(names[i]);
		}

		// To get content of the array
		System.out.println(Arrays.toString(obj));
	}

}
