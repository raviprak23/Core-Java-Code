package abstrac;

abstract class Shape {
	public abstract void calculateArea(); // abstract method

	public void calculateArea(int a) { // overloaded method
		System.out.println("Area of shape with one parameter: " + a * a);
	}

	public void calculateArea(int a, int b) { // overloaded method
		System.out.println("Area of shape with two parameters: " + a * b);
	}
}

class Rectangle extends Shape {
	public void calculateArea() { // implementation of abstract method
		System.out.println("Area of rectangle is calculated.");
	}
}

public class abstractmethoverload {

	public static void main(String[] args) {
		Shape s = new Rectangle();
		s.calculateArea(); // calls the abstract method in Rectangle class

		Rectangle r = new Rectangle();
		r.calculateArea(5); // calls the overloaded method in Rectangle class with one parameter
		r.calculateArea(4, 6); // calls the overloaded method in Rectangle class with two parameters
	}
}
