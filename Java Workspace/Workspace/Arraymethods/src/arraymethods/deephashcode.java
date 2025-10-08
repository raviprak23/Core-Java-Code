package arraymethods;

import java.util.Arrays;

public class deephashcode {
	public static void main(String[] args) {
		// Fetching first Array
		int Arr[][] = { { 10, 20, 15, 22, 35 } };
		// Getting deep hashCode of arrays
		System.out.println(Arrays.deepHashCode(Arr));
	}
}