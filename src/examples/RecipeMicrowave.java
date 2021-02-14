package examples;

public class RecipeMicrowave extends AbstractRecipe {

	@Override
	public void getReady() {
		System.out.println("Get the ingredients");
		System.out.println("Get the Utensils");
		System.out.println("Swtichon the microwave");
	}

	@Override
	public void dotheDish() {
		System.out.println("Prepare the dish");
		System.out.println("put the dish in the micorwave");
	}

	@Override
	public void cleanUp() {
		System.out.println("Clean up the Utensils");
		System.out.println("Switchoff the microwave");
	}

}
