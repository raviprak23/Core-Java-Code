package practice;

abstract class Parent2{
	public Parent2() {
		System.out.println("I am a constructor");
		
	}
	public void sayHello() {
		System.out.println("Hello");
		
	}
	abstract public void greet();
	abstract public void greet2();
	
}

	class child2 extends Parent2{
		public void greet() {
			System.out.println("Good morning");
		}
		public void greet2() {
			System.out.println("Good afternoon");
		}
	}
abstract class child3 extends Parent2{
	public void th() {
		System.out.println("i am good");
	}
}


public class Abstractclass {
	
	public static void main(String[] args) {
		child2 a = new child2();
		a.greet();
		//Parent2 p = new Parent2();
		//child3 c3 = new child3();
	}

}

