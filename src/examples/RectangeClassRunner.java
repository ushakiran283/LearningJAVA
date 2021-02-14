package examples;

public class RectangeClassRunner {

	public static void main(String[] args) {

		RectangeClassObjectOriented rectangle = new RectangeClassObjectOriented(12, 23);

		System.out.println(rectangle);

		// you want to change the width, use setter and getter methods
		rectangle.setLength(20);
		System.out.println("Length of the rectangle  : " + rectangle.getLength());
		System.out.println(rectangle);

		rectangle.setWidth(6);
		System.out.println(rectangle);
	}

}
