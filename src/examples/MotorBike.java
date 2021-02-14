package examples;

public class MotorBike {
	// State
	private int speed;

	// Constructor
	public MotorBike(int speed) {
		this.speed = speed;
	}

	// Behaviour

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	void Start() {
		System.out.println("Bike started");
	}

	void Stop() {
		System.out.println("Bike stopped");
	}
}
