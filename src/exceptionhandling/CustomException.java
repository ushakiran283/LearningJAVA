package exceptionhandling;

public class CustomException {

	private String currency;
	private int amount;

	public CustomException(String currency, int amount) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	public String toString() {
		return amount + " " + currency;
	}

	class CurrenciesDonotMatchException extends Exception {

	}

	public void add(CustomException that) throws CurrenciesDonotMatchException {

		if (!this.currency.equals(that.currency)) {
			throw new CurrenciesDonotMatchException();
		}
		this.amount = this.amount + that.amount;

	}

	public static void main(String[] args) throws CurrenciesDonotMatchException {

		CustomException amount1 = new CustomException("USD", 10);
		CustomException amount2 = new CustomException("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
