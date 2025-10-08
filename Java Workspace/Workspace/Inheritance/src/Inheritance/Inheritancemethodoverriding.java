package Inheritance;


//Parent class
	class Amphians {
			public void makeSound() {
				System.out.println("Amphians is making a sound");
			}
	}

//Child class inheriting from Animal class
	class Penguin extends Amphians {
		@Override // Annotation to indicate overriding
		public void makeSound() {
			System.out.println("Penguin is qwack");
		}
}

//Main class
	public class Inheritancemethodoverriding {
		public static void main(String[] args) {
			Amphians amphians = new Amphians(); // Create Amphians object
			amphians.makeSound(); // Output: Amphians is making a sound
  
			Penguin penguin = new Penguin(); // Create penguin object
			penguin.makeSound(); // Output: penguin is qwack
		}
}