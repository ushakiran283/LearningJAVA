package examples;

public class InheritanceRunner {

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setEmployer("ushakiran");
		employee.setTitle("QA Engineer");
		employee.setEmail("nimmagaddaushakiran@gmail.com");
		employee.setPhonenumber(123456789);
		employee.setEmployeegrade('A');

		System.out.println(employee);
	}

}
