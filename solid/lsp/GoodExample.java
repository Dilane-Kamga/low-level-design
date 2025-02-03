// 🔹 Good Example – Use composition instead of inheritance:

interface Shape {
	int getArea();
}

class Rectangle implements Shape {
	protected int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() { return width * height; }
}

class Square implements Shape {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int getArea() { return side * side; }
}

// ✅ Fix: Now, Square and Rectangle follow LSP because they don’t interfere with each other’s logic.


