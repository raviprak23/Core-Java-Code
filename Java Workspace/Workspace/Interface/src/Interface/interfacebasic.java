package Interface;

//public class interfacebasic {

//}

interface Shape {
	   double calculateArea();
	}

	class Circle implements Shape {
	   private double radius;

	   public Circle(double radius) {
	      this.radius = radius;
	   }

	   public double calculateArea() {
	      return Math.PI * radius * radius;
	   }
	}

	class Rectangle implements Shape {
	   private double length;
	   private double width;

	   public Rectangle(double length, double width) {
	      this.length = length;
	      this.width = width;
	   }

	   public double calculateArea() {
	      return length * width;
	   }
	}

	public class interfacebasic {
	   public static void main(String[] args) {
	      Circle circle = new Circle(5);
	      System.out.println("Area of circle: " + circle.calculateArea());

	      Rectangle rectangle = new Rectangle(4, 6);
	      System.out.println("Area of rectangle: " + rectangle.calculateArea());
	   }
	}
