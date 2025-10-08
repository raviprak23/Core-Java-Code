package practice;

import java.util.Scanner;

public class InputValidation {
	static String input;

	public static void main(String args[]) {
		System.out.println("Enter a String ");
		System.out.println("Enter a integer");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext("[0-9]*")) {
			input = sc.next();
			System.out.println("you entered a integer value "+ input);
		} else {
			System.out.println("please enter a valid valuer");
		}
		if (sc.hasNext("[A-Za-z]*")) {
			input = sc.next();
			System.out.println("You entered a string value " + input);
		} else {
			System.out.println("Please Enter a Valid Value");
		}
	}
}