package javaStringsMethod;

//public class stringcontentequal {

//}
class stringcontentequal {
	  @SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
	    String str1 = "Java";
	    StringBuffer sb1 = new StringBuffer("Java");

	    System.out.println(str1.equals(sb1)); // false
	    System.out.println(str1.contentEquals(sb1)); // true
	  }
	}
