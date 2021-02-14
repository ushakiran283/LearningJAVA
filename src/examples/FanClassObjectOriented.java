package examples;

public class FanClassObjectOriented {

	// Sate of the object
	private String color; // color of the fan
	private double radius; // radius of the wing
	private String maker; // manuafacturer of the fan
	private boolean ison; // weather fan is on/off
	private byte speed; // speed level of the fan i.e 0 to 5

	// Costructor
	FanClassObjectOriented(String maker, String color, double radius) {
		this.maker = maker;
		this.color = color;
		this.radius = radius;
	}

	// Behaviour
	// To print content of the constructor we use toString
	public String toString() {
		// return "color - " + color + ',' + "Manufacturer - " + maker + ',' + "Radius -
		// " + radius;
		// or use String.format concept
		return String.format("maker - %s, radius - %f, color - %s, ison - %b, speed - %d", maker, radius, color, ison,
				speed);
	}

	/*
	 * // ison public void ison(boolean ison) { this.ison = ison; }
	 */

	// as consumer point of view we can mention "ison" as below
	public void SwitchOn() {
		this.ison = true;
	}

	public void SwitchOff() {
		this.ison = false;
		SetSpeed((byte) 0);
	}

	public void SetSpeed(byte speed) {
		this.speed = speed;
	}

}
