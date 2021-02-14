package examples;

public class DetailsUsingEncapsulation {

	private String name, email;
	private int age;
	private long phonenumber;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setage(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public long getPhonenumber() {
		return phonenumber;

	}
}
