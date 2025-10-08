package javaStringsMethod;

//public class stringformat {

//}
class stringformat {
	  public static void main(String[] args) {
	    String language = "Java";
	    int number = 30;
	    String result;

	    // format object as a string
	    result = String.format("Language: %s", language);

	    System.out.println(result);  // Language: Java

	    // format number as a hexadecimal number
	    result = String.format("Hexadecimal Number: %x", number);  // 1e

	    System.out.println(result); // Hexadecimal Number: 1e
	 }
}
