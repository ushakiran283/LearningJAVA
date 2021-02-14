package examples;

public class VariableArgumentsArrayRunner {

	public static void main(String[] args) {

		// VariableArgumentsArray s = new VariableArgumentsArray("usha", new int[] { 10,
		// 20, 30 });

//		int[] values = { 10, 20, 30, 40 };
//		String name = "ushakiran";
//		VariableArgumentsArray s = new VariableArgumentsArray(name, values);

		VariableArgumentsArray s = new VariableArgumentsArray("ushakiran", 10, 20, 30);
		s.PrintValues();
	}

}
