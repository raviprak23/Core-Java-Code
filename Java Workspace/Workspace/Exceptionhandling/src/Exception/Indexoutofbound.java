package Exception;

public class Indexoutofbound {
	public static void main(String[] args) {
		try {
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[2]); // accessing an element outside the bounds of the array
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
