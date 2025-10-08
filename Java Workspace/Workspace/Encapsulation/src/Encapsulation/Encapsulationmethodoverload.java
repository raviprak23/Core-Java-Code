package Encapsulation;

public class Encapsulationmethodoverload {
	private int myVar;

	// Getter method for myVar
	public int getMyVar() {
		return myVar;
	}

	// Setter method for myVar
	public void setMyVar(int myVar) {
		this.myVar = myVar;
	}

	// Overloaded setter method for myVar
	public void setMyVar(String myVar) {
		this.myVar = Integer.parseInt(myVar);
	}

	// Main method
	public static void main(String[] args) {
		// Create an instance of MyClass
		Encapsulationmethodoverload obj = new Encapsulationmethodoverload();

		// Set myVar using the int setter method
		obj.setMyVar(10);

		// Get myVar using the getter method
		System.out.println("myVar = " + obj.getMyVar());

		// Set myVar using the String setter method
		obj.setMyVar("20");

		// Get myVar using the getter method
		System.out.println("myVar = " + obj.getMyVar());
	}
}
