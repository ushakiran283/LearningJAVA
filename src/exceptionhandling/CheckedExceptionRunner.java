package exceptionhandling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {

		/*
		 * try { SomeOtherMethod(); Thread.sleep(2000); // It will wait for 2seconds }
		 * catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		SomeOtherMethod1();

	}

	private static void SomeOtherMethod1() throws RuntimeException {
		// Thread.sleep(2000);
	}

	private static void SomeOtherMethod() throws InterruptedException {
		Thread.sleep(2000);
	}

}
