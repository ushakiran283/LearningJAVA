package examples;

public class DetailsUsingEncapsulationRunner {

	public static void main(String[] args) {
		DetailsUsingEncapsulation details = new DetailsUsingEncapsulation();
		details.setName("Ushakiran");
		System.out.println("Name is : " + details.getName());
		details.setage(30);
		System.out.println("Age is :" + details.getAge());
		details.setemail("ushakiran@email.com");
		System.out.println("Email is :" + details.getEmail());
		details.setPhonenumber(8790444353L);
		System.out.println("Phonenumber is : " + details.getPhonenumber());
	}

}
