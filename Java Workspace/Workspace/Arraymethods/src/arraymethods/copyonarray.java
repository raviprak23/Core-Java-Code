package arraymethods;

import java.util.Arrays;

public class copyonarray {
	public static void main(String[] args) {
		// Fetching Array
		int Arr[] = { 10, 25, 55, 22, 35 };
		// Printing the elements in a single line
		System.out.println("The Integer Array is: " + Arrays.toString(Arr));

		System.out.println("\nThe new Arrays fetched by copyOf is :\n");
		System.out.println("Integer Array is: " + Arrays.toString(Arrays.copyOf(Arr, 10)));

	}
}