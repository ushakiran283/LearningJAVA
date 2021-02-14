package exceptionhandling;

public class ExceptionRunner {

	public static void main(String[] args) {

		method2();
		System.out.println("Main Ended");
	}

	private static void method2() {
		method1();
		System.out.println("Method1 Ended");

	}

	private static void method1() {
		String s = null;
		s.length();
		System.out.println("Method2 Ended");

	}

}
