package Inheritance;


class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }
    
    public void makeSound(String message) {
        System.out.println("The dog says: " + message);
    }
}

public class Inheritancemethodoverloading {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        
        animal.makeSound(); // outputs "The animal makes a sound"
        dog.makeSound(); // outputs "The dog barks"
        dog.makeSound("Hello!"); // outputs "The dog says: Hello!"
    }
}