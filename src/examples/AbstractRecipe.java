package examples;

public abstract class AbstractRecipe {

	public void execute() {
		getReady();
		dotheDish();
		cleanUp();
	}

	// Get the ingredients and utensils for the recipe
	abstract public void getReady();

	// Do the recipe
	abstract public void dotheDish();

	// Cleanup the utensils and all
	abstract public void cleanUp();

}
