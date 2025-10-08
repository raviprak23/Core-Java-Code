package training;

class shape {
	public void areaShape() {
		System.out.println("The formula for area of");
	}
}

class Triangle extends shape {
	public void areaTriangle() {
		System.out.println("Triangle is 1/2 * base * height");
	}
}

class Circle extends shape {
	public void areaCircle() {
		System.out.println("Circle is 3.14 * radius * radius");
	}
}

public class shapes {

	public static void main(String[] args) {

		shape myshapes = new shape();
		Triangle mytraingle = new Triangle();
		Circle mycircle = new Circle();

		myshapes.areaShape();
		mytraingle.areaTriangle();
		// myshape.area();
		mycircle.areaCircle();

	}
}
