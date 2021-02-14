package exceptionhandling;

public class ExceptionRunnerFinally {

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
			int num = a[6];
			System.out.println("Method2 Ended");
		} catch (Exception ex) {
			System.out.println("Matched Exception");
			ex.printStackTrace();
		} finally {
			System.out.println("Finaly block is optional");
		}
	}

}
