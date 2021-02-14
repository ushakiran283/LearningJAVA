package examples;

import java.util.Arrays;

public class VariableArgumentsArray {

	private String name;
	private int[] values;

	public VariableArgumentsArray(String name, int... values) {
		this.name = name;
		this.values = values;
	}

	public void PrintValues() {
		System.out.println(Arrays.toString(values));
	}

}
