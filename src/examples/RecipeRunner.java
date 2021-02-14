package examples;

public class RecipeRunner {

	public static void main(String[] args) {

		Recipe recipe = new Recipe();
		recipe.execute();
		System.out.println("------------------");
		RecipeMicrowave recipemicrowave = new RecipeMicrowave();
		recipemicrowave.execute();
	}

}
