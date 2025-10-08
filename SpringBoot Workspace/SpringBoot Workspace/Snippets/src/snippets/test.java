package snippets;

//public class test {

//}
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter characters (separated by spaces): ");
        String[] chars = sc.nextLine().split(" ");
        System.out.print("Enter word size: ");
        int size = sc.nextInt();
        sc.close();

        if (chars.length < size) {
            System.out.println("Error: Word size is greater than the number of characters");
            return;
        }

        generateWords(chars, size, "");
    }

    private static void generateWords(String[] chars, int size, String prefix) {
        if (prefix.length() == size) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            generateWords(chars, size, prefix + chars[i]);
        }
    }
}