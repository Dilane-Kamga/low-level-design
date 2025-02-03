// 🔹 Bad Example – A Rectangle class that breaks when extended:

class Rectangle {
	protected int width, height;

	public void setWidth(int width) { this.width = width; }
	public void setHeight(int height) { this.height = height; }
	public int getArea() { return width * height; }
}

class Square extends Rectangle {
	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}

	@Override
	public void setHeight(int height) {
		super.setWidth(height);
		super.setHeight(height);
	}
}

// ❌ Problem: The Square class modifies the behavior of Rectangle. Setting width affects height, breaking expected behavior.