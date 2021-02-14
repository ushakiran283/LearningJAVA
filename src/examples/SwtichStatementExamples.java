package examples;

import java.util.Scanner;

public class SwtichStatementExamples {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String sun = "Sunday";
		String mon = "Monday";
		String tues = "Tuesday";
		String wed = "Wednesday";
		String thur = "Thursday";
		String fri = "Friday";
		String sat = "Saturday";
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		System.out.println("Choice entered is :" + number);
		Swtichdays(number, sun, mon, tues, wed, thur, fri, sat);
	}

	public static void Swtichdays(int number, String sun, String mon, String tues, String wed, String thur, String fri,
			String sat) {
		switch (number) {
		case 1:
			System.out.println("Day is " + sun);
			break;
		case 2:
			System.out.println("Day is " + mon);
			break;
		case 3:
			System.out.println("Day is " + tues);
			break;
		case 4:
			System.out.println("Day is " + wed);
			break;
		case 5:
			System.out.println("Day is " + thur);
			break;
		case 6:
			System.out.println("Day is " + fri);
			break;
		case 7:
			System.out.println("Day is " + sat);
			break;
		}
	}
}
