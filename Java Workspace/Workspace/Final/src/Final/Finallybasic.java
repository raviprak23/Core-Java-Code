package Final;

public class Finallybasic {
	public static int greet() {
	try {
		int a = 23;
		int b = 0;
		int c = a/b;
		return c;
	}
	catch (Exception e) {
		System.out.println(e);
		
	}
	finally {
		
		System.out.println("Cleaning the resources");
	}
	return -1;
	}
	public static void main(String[] args) {
		
	int k = greet();
	System.out.println(k);
	}
}


