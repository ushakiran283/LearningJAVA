package examples;

public class MultiplicationTable {

	// Creating a method for multiplication table(without parameter)
	void printtable() {
		/*
		 * for (int i = 1; i <= 10; i++) { System.out.printf("%d * %d = %d \n", 5, i, 5
		 * * i); }
		 */
		// printtable(8, 1, 10); or we can use below statement
		printtable(8); // to avoid duplication we have refactored the code
	}

	// Creating a method for multiplication table(with parameter)
	void printtable(int table) {
		/*
		 * for (int i = 1; i <= 10; i++) { System.out.printf("%d * %d = %d \n", table,
		 * i, table * i); }
		 */
		printtable(table, 1, 10);
	}

	// Creating a method for multiplication table(with multiple parameters)
	void printtable(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d \n", table, i, table * i);
		}
	}

}
