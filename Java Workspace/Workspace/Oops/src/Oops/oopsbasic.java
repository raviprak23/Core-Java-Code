package Oops;

//public class oopsbasic {

//}
//package oops; 

// Define an abstract class called "Shape" 
abstract class Shape { 
    // Instance variable 
    protected String color; 

    // Constructor method 
    public Shape(String color) { 
        this.color = color; 
    } 

    // Abstract method 
    public abstract double getArea(); 

    // Getter method 
    public String getColor() { 
        return color; 
    } 

    // Setter method 
    public void setColor(String color) { 
        this.color = color; 
    } 
} 

// Define a subclass called "Circle" that inherits from "Shape" 
class Circle extends Shape { 
    // Instance variable 
    private double radius; 

    // Constructor method 
    public Circle(String color, double radius) { 
        super(color); 
        this.radius = radius; 
    } 

    // Implement the abstract method 
    public double getArea() { 
        return Math.PI * radius * radius; 
    } 

    // Getter method 
    public double getRadius() { 
        return radius; 
    } 

    // Setter method 
    public void setRadius(double radius) { 
        this.radius = radius; 
    } 
} 

// Define a subclass called "Rectangle" that inherits from "Shape" 
class Rectangle extends Shape { 
    // Instance variables 
    private double width; 
    private double height; 

    // Constructor method 
    public Rectangle(String color, double width, double height) { 
        super(color); 
        this.width = width; 
        this.height = height; 
    } 

    // Implement the abstract method 
    public double getArea() { 
        return width * height; 
    } 

    // Getter methods 
    public double getWidth() { 
        return width; 
    } 

    public double getHeight() { 
        return height; 
    } 

    // Setter methods 
    public void setWidth(double width) { 
        this.width = width; 
    } 

    public void setHeight(double height) { 
        this.height = height; 
    } 
} 

// Define the main class 
public class oopsbasic { 
    public static void main(String[] args) { 
        // Create a new Circle object 
        Circle circle = new Circle("red", 5); 

        // Print the color and area of the circle 
        System.out.println("The circle is " + circle.getColor() + " and has an area of " + circle.getArea()); 

        // Create a new Rectangle object 
        Rectangle rectangle = new Rectangle("blue", 4, 6); 

        // Print the color and area of the rectangle 
        System.out.println("The rectangle is " + rectangle.getColor() + " and has an area of " + rectangle.getArea()); 

        // Use polymorphism to create an array of Shapes and add the Circle and Rectangle objects to it 
        Shape[] shapes = new Shape[2]; 
        shapes[0] = circle; 
        shapes[1] = rectangle; 

        // Loop through the array and print the color and area of each Shape object 
        for (Shape shape : shapes) { 
            System.out.println("The " + shape.getClass().getSimpleName() + " is " + shape.getColor() + " and has an area of " + shape.getArea()); 
        } 
    } 
}

