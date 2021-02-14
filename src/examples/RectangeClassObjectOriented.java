package examples;

public class RectangeClassObjectOriented {

	// State
	private int length;
	private int width;

	// Constructor
	RectangeClassObjectOriented(int length, int width) {
		this.length = length;
		this.width = width;
	}

	// Behaviour
	public String toString() {
		return String.format("length - %d, width = %d, areaOfRectangle = %d, perimeterOfRectangle = %d ", length, width,
				areaOfRectangle(), perimeterOfRectangle());
	}

	public int areaOfRectangle() {

		return length * width;
	}

	public int perimeterOfRectangle() {

		return 2 * areaOfRectangle();
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
