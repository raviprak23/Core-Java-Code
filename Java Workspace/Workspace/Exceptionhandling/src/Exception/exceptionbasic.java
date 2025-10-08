package Exception;

import java.util.Scanner;

public class exceptionbasic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");

		try {
			int num = sc.nextInt();
			int result = 10 / num;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
		} catch (Exception e) {
			System.out.println("Invalid input.");
		} // finally {
			// System.out.println("Program completed.");
			// }
	}
}
