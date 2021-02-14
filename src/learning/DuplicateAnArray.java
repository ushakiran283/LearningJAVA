package learning;

public class DuplicateAnArray {

	public static void main(String[] args) {

		int[] obj = { 1, 2, 2, 3, 4, 5, 6, 6, 4 };
		// System.out.println(obj.length);
		for (int i = 0; i < obj.length; i++) {
			// System.out.println(obj[i]);
			for (int j = i + 1; j < obj.length; j++) {
				if (obj[i] == obj[j]) {
					System.out.println(obj[j]);
				}
			}
		}

	}
}
