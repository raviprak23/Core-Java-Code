package constructor;

 //finalize() {
	 
//

public class destructor {
	public static void main(String[] args) {
		destructor d = new destructor();
		d.finalize();
		d = null;
		System.gc();
		System.out.println("Inside the main method");
	}
	
	protected void finalize() {
		System.out.println("object is destroyed by the garbage collector");
	}
}

