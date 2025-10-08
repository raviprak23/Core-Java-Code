package practice;

public class sand {
	public sand() {
		System.out.println("a");
	}
	public void sand() {
		System.out.println("b");
		
	}
	public void run() {
		new sand();
		sand();
		
	}
	public static void main(String[] args) {
		new sand().run();
		
	}
	
}
