package practice;

public class practice2 {
	public static String travel(int distance) {
		return distance<1000 ? "train" : "10";
	}
	public static void main(String[] answer) {
		System.out.println(travel(500));
	}
}
