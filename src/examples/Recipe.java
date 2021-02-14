package examples;

public class Recipe extends AbstractRecipe {

	@Override
	public void getReady() {
		System.out.println("Get the ingredients");
		System.out.println("Get the Utensils");

	}

	@Override
	public void dotheDish() {
		System.out.println("Prepare the dish");
	}

	@Override
	public void cleanUp() {
		System.out.println("Clean up the Utensils");
	}

}
