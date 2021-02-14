package examples;

public class ParseIntRunner {
	public static void main(String[] args) {

		String num = "100";
		// Convert "String to integer", we use parseInt or valueOf() method which is
		// wrapper utility class
		/*
		 * int num1 = Integer.parseInt(num); System.out.println("Number is " + num1);
		 */
		Integer i = Integer.valueOf(num);
		System.out.println(i);

		// Convert num to string
		int num1 = 34;
//		String s = String.valueOf(num1);
//		System.out.println(num1);

		String s = Integer.toString(num1);
		System.out.println(s);

	}

}
