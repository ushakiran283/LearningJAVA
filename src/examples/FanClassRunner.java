package examples;

public class FanClassRunner {

	public static void main(String[] args) {

		FanClassObjectOriented fan = new FanClassObjectOriented("Bajaj", "Black", 0.348);

		// fan.ison(false); // it will return ison as false
		fan.SwitchOn();
		fan.SetSpeed((byte) 2);
		System.out.println(fan);
		fan.SwitchOff();
		System.out.println(fan);
	}

}
