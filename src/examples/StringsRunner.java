package examples;

public class StringsRunner {

	public static void main(String[] args) {

		String somestring = "This is a lot of text again";
		// System.out.println(somestring.length());
		// System.out.println(somestring.charAt(3));
		// Print the string character by character
//		for (int i = 0; i < somestring.length(); i++) {
//			System.out.println(somestring.charAt(i));
//		}

		// Verify if particular word/character ex: lot is present in the string. we use
		// indexof
		System.out.println(somestring.indexOf("lot"));
		System.out.println(somestring.indexOf("i"));

	}

}
