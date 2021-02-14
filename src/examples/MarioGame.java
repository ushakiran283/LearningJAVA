package examples;

public class MarioGame implements GamingConsole {

	@Override
	public void Up() {
		System.out.println("Move up");
	}

	@Override
	public void down() {
		System.out.println("Move down");

	}

	@Override
	public void left() {
		System.out.println("Move left");

	}

	@Override
	public void right() {
		System.out.println("Move right");

	}

}
