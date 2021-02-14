package oops;

public class AbstractRunner {

	public static void main(String[] args) {

		Animal[] animal = { new Dog(), new kitten() };

		for (Animal obj : animal) {
			obj.bark();
		}

	}

}
