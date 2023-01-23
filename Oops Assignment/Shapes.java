package oops;

abstract class Shape{
	abstract void draw();
}
class Lines extends Shape{
	void draw() {
		System.out.println("Draw the shape of line.");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Draw the shape of rectangle.");
	}
}

class Cube extends Shape{
	void draw() {
		System.out.println("Draw the shape of cube.");
	}
}

public class Shapes {
	public static void main(String[] args) {
		Lines a1 = new Lines();
		a1.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Cube c = new Cube();
		c.draw();
	}

}
