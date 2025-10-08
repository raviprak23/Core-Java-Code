package practice;

public class practice1 {
	static {
		System.out.println("static");
	}
	private static void drive() {
		System.out.println("fast");
		
	}
	public static void main(String[] args) {
		drive();
		drive();
		
	}

}
