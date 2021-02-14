package examples;

import java.util.Scanner;

public class ConditionalStatementRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number1 :");
		int number1 = scanner.nextInt();
		System.out.println("Number you entered is = " + number1);
		System.out.println("Enter number2 :");
		int number2 = scanner.nextInt();
		System.out.println("Number you entered is = " + number2);

		// Enter the choices
		System.out.println("Choices available are:");
		System.out.println("1-add");
		System.out.println("2-sub");
		System.out.println("3-multiply");
		System.out.println("4-divide");

		System.out.println("Enter the choice : ");
		int choice = scanner.nextInt();
		System.out.println("Choice entered is = " + choice);

		// instead of using nested if else code try to create a method and call that
		// method i.e select the code to be present in method and click "Refactor" and
		// click "Extract method"
		// operationsperformedUsingNestedif(number1, number2, choice);
		operationsperformedUsingSwitch(number1, number2, choice);
	}

	private static void operationsperformedUsingNestedif(int number1, int number2, int choice) {
		if (choice == 1) {
			System.out.println("Number is = " + (number1 + number2));
		} else if (choice == 2) {
			System.out.println("Number is = " + (number1 - number2));
		} else if (choice == 3) {
			System.out.println("Number is = " + (number1 * number2));
		} else if (choice == 4) {
			System.out.println("Number is = " + (number1 / number2));
		} else {
			System.out.println("invalid operation");
		}
	}

	private static void operationsperformedUsingSwitch(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("Number is = " + (number1 + number2));
			break;
		case 2:
			System.out.println("Number is = " + (number1 - number2));
			break;
		case 3:
			System.out.println("Number is = " + (number1 * number2));
			break;
		case 4:
			System.out.println("Number is = " + (number1 / number2));
			break;
		default:
			System.out.println("invalid operation");
			break;
		}
	}
}
