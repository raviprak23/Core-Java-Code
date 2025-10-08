package javaStringsMethod;

//public class stringsgetbytes {

//}
import java.util.Arrays;

	class stringgetbytes {
		public static void main(String[] args) {

			String str = "Java";
			byte[] byteArray;

			// convert the string to a byte array
			// using platform's default charset
			byteArray = str.getBytes();
			System.out.println(Arrays.toString(byteArray));
		}
}
