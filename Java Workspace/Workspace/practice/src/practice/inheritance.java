package practice;
class Parent{
	void bike() {
		System.out.println("hero");
	}
}	
class Child extends Parent{
	void cycle() {
		System.out.println("atluse");
	}
	
}
public class inheritance {

	public static void main(String[] args) {
	Child c = new Child();// creating object a child
	c.bike();//call a function 
	c.cycle();
	}

}
