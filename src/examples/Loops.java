package examples;

public class Loops {

	private int number;

	public Loops(int number) {
		this.number = number;
	}

	public int SumUptoN() {
		// 1+2+3+4....N
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public int SumOfDivisors() {
		int sum = 0;
		for (int i = 2; i <= number; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	// Print number triangle
	// 1
	// 1 2
	// 1 2 3
	// 1 2 3 4
	// 1 2 3 4 5
	public void PrintNumberTriange() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// Using While 1 sqaure, 2 sqaure, 3 sqaure....
	public void PrintSquaresOfNumber() {
		int i = 1;
		while (i * i < number) {
			System.out.print(i * i + " ");
			i++;
		}
	}

	// Using While 1 cube, 2 cube, 3 cube....
	public void PrintCubesOfNumber() {
		int i = 1;
		while (i * i * i < number) {
			System.out.print(i * i * i + " ");
			i++;
		}
	}

}
