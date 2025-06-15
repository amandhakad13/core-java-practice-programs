interface Shape {
	void draw();
}

class Circle implements Shape {
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

public class Program1 {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		c1.draw();
	}
}