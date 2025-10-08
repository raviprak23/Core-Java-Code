package abstrac;

abstract class Format {
	abstract double area(); // abstract method
}

class Square extends Format {
	private double width, height;

	Square(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double area() { // overriding the abstract method
		return width * height;
	}
}

class Circle extends Format {
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	double area() { // overriding the abstract method
		return Math.PI * radius * radius;
	}
}

public class abstractmethoverride {

	public static void main(String[] args) {
		Format format1 = new Square(5, 10);
		System.out.println("Area of Square: " + format1.area());

		Format format2 = new Circle(7);
		System.out.println("Area of circle: " + format2.area());
	}
}
