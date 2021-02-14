package learning;

public class ReverseAString {

	public static void main(String[] args) {

		String s = "Dream Big";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		System.out.println("---------------------");
		// Reverse a string
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}

		System.out.println("............................");

		// Reverse the string using "reverse" method
		String s1 = "hello hi";
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse());
	}

}
