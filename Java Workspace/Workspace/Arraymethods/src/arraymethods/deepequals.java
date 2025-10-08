package arraymethods;

import java.util.Arrays;

public class deepequals {
	public static void main(String[] args) {
		// Fetching first Array
		int Arr[][] = { { 10, 20, 35, 82, 95 } };
		// Fetching second Array
		int Arr2[][] = { { 10, 15, 22 } };
		// Comparing both arrays
		System.out.println("Arrays when compared: " + Arrays.deepEquals(Arr, Arr2));

	}
}