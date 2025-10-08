package arraymethods;

import java.util.Arrays;

public class arraybinarysearch {
	public static void main(String[] args) {
		// Fetching Array
		int Arr[] = { 10, 30, 35, 52, 75 };
		Arrays.sort(Arr);
		int ele = 35;
		System.out.println(ele + " is found at index = " + Arrays.binarySearch(Arr, ele));

	}
}