package examples;

public class BiNumber {

	private int a, b;

	// Constructor
	BiNumber(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// Methods
	public int add() {
		int add = a + b;
		return add;
	}

	public int multiply() {
		int multiply = a * b;
		return multiply;
	}

	public void doublethenum() {
		this.a *= 2;
		this.b *= 2;
	}

	public void setnumber1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void setnumber2(int b) {
		this.b = b;
	}

	public int getnumber1() {
		return a;
	}

	public int getnumber2() {
		return b;
	}
}
