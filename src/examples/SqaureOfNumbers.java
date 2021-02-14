package examples;

public class SqaureOfNumbers {

	// Print squares of numbers from 1 to 10(Without parameter)
	void printsqaure() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * i);
		}
	}

	// Print squares of numbers from 1 to 10(With parameter)
	void printsqaure(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i * i);
		}
	}

	// Print squares of numbers from 1 to 10(With multiple parameters)
	void printsqaure(int number, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.println(i * i);
		}
	}

}
