public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle() {
		this.length = 0;
		this.width = 0;
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}

}
