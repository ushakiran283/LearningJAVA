package examples;

public class MotorBikeRunner {

	public static void main(String[] args) {

		// Create instances of the MotorBike
		MotorBike dukati = new MotorBike(100);
		MotorBike honda = new MotorBike(30);
		System.out.println("Speed of dukati is :" + dukati.getSpeed());
		System.out.println("Speed of honda is :" + honda.getSpeed());

		dukati.Start();
		dukati.Stop();

		dukati.setSpeed(40);
		System.out.println("Speed of dukati is :" + dukati.getSpeed());
		honda.setSpeed(60);
		System.out.println("Speed of honda is :" + honda.getSpeed());

	}

}
