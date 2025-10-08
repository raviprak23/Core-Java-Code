package arraymethods;

import java.util.Arrays;

public class copyonrange {
	public static void main(String[] args) {
		// Fetching Array
		int Arr[] = { 20, 30, 15, 22, 35 };
		// Printing the elements in a single line
		System.out.println("Integer Array is: " + Arrays.toString(Arr));

		System.out.println("\nThe new Arrays through copyOfRange is :\n");
		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOfRange(Arr, 1, 3)));

	}
}