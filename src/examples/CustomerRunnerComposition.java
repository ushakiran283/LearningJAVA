package examples;

public class CustomerRunnerComposition {

	public static void main(String[] args) {

		Address homeaddress = new Address("RiceMill Bazar", "Medikonduru", "522438");
		Customer customer = new Customer("usha", homeaddress);

		System.out.println("Home Address : " + homeaddress);
		System.out.println("Customer :" + customer);

	}

}
