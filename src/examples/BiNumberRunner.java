package examples;

public class BiNumberRunner {

	public static void main(String[] args) {

		BiNumber number = new BiNumber(2, 3);
		// System.out.println(number.add()); // 2+3
		System.out.println(number.multiply());// 2*3
		number.doublethenum();// 4, 6
		System.out.println("Number a is :" + number.getnumber1());
		System.out.println("Number b is :" + number.getnumber2());

	}

}
