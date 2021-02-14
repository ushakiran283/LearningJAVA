package oops;

public class InterfaceRunner {

	public static void main(String[] args) {

		Flyable[] fly = { new Bird(), new Aeroplane() };

		for (Flyable obj : fly) {
			obj.fly();
		}
	}

}
