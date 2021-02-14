package exceptionhandling;

import java.util.Scanner;

public class Try_With_Resources {
	static Scanner scanner;

	public static void main(String[] args) {
		try {
			scanner = new Scanner(System.in);
			int[] numbers = { 1, 2, 3, 4 };
			int number = numbers[5];
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			System.out.println("Before Scanner executed");
			scanner.close();

		}
	}
}
