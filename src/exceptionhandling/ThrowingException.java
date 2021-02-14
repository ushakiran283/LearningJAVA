package exceptionhandling;

public class ThrowingException {

	private String currency;
	private int amount;

	public ThrowingException(String currency, int amount) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	public String toString() {
		return amount + " " + currency;
	}

	public void add(ThrowingException that) throws Exception {

		if (!this.currency.equals(that.currency)) {
			throw new Exception("Currencies dont match" + " " + this.currency + " & " + that.currency);
		}
		this.amount = this.amount + that.amount;

	}

	public static void main(String[] args) throws Exception {

		ThrowingException amount1 = new ThrowingException("USD", 10);
		ThrowingException amount2 = new ThrowingException("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
