package oops;

abstract class AnimalRunner {
	abstract void bark();
}

class Dogs extends AnimalRunner {
	public void bark() {
		System.out.println("Bow Bow");
	}
}

class cats extends AnimalRunner {
	public void bark() {
		System.out.println("Meow Meow");
	}
}

public class Animals {

	public static void main(String[] args) {
		AnimalRunner[] animal = { new Dogs(), new cats() };

		for (AnimalRunner obj : animal) {
			obj.bark();
		}
	}

}
