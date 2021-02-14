package examples;

public class StringArrayRunner {

	public static void main(String[] args) {

		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		// Most number of characters
		String daywithmostcharacters = "";
		for (String day : daysOfWeek) {
			if (day.length() > daywithmostcharacters.length()) {
				daywithmostcharacters = day;
			}
		}
		System.out.println("Day with most of the characters :" + daywithmostcharacters);

		// Print Days in a week
		for (int i = 0; i < daysOfWeek.length; i++) {
			System.out.println("Days are :" + daysOfWeek[i]);
		}

		// Print days in a reverse order
		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println("Days in reverse order are : " + daysOfWeek[i]);
		}

	}

}
