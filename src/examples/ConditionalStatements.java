package examples;

public class ConditionalStatements {

	public static void main(String[] args) {
		/*//Multiplication table
		 * int num = 6; for(int i=1; i<=10; i++) { System.out.printf("%d * %d = %d \n",
		 * num, i, num*i); }
		 */
		/*
		 * // Print 1 to 10 numbers for(int i=1; i<=10; i++) {
		 * System.out.printf("%d \n", i); }
		 */
		
		/*
		 * // Print 10 to 1 numbers for(int i=10; i>=1; i--) {
		 * System.out.printf("%d \n", i); }
		 */
		/*
		 * //Print squares of first 10 even numbers for(int i=1; i<=10; i++) { if(i%2==0) {
		 * System.out.printf("%d \n", i*i); } }
		 */
		// Print squares of first 10 odd numbers
		for(int i=1; i<=20; i++) { 
			if(i%2==1) {
				System.out.printf("%d \n", i*i); } }
	}

}
