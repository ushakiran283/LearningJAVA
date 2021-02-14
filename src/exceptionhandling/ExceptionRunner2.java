package exceptionhandling;

public class ExceptionRunner2 {

	public static void main(String[] args) {

		method2();
		System.out.println("Main Ended");
	}

	private static void method2() {
		method1();
		System.out.println("Method1 Ended");

	}

	private static void method1() {
		try {
			int[] a = { 1, 2, 3, 4 };
			int num = a[5];
			System.out.println("Method2 Ended");
		} catch (NullPointerException ex) {
			System.out.println("Matched Null Pointer Exception");
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Matched Exception");
			ex.printStackTrace();
		}
	}

}
