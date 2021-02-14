package oops;

class MutliplyRunner {
	static int Multiply(int a, int b) {
		return a * b;
	}

	static int Multiply(int a, int b, int c) {
		return a * b * c;
	}
}

public class MultiplyComplileTimePolymorphism {

	public static void main(String[] args) {
		System.out.println(MutliplyRunner.Multiply(2, 4));
		System.out.println(MutliplyRunner.Multiply(7, 4, 2));
	}

}
