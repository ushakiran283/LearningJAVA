package examples;

public class RunnerInterface {

	public static void main(String[] args) {

		// MarioGame game = new MarioGame();
		GamingConsole game = new MarioGame();
		// GamingConsole game = new ChessGame();

		game.down();
		game.left();
		game.right();
		game.Up();
	}

}
