//package stringmethods;

//public class Mycharat {

//}
package stringmethods;

	class CharAtClass {
		public char CharAt (String str, int index) {
			char str1[] = str.toCharArray();
			return str1[index];
		}
}

	public class Mycharat {
		public static void main(String[] args) {
			CharAtClass obj = new CharAtClass();
			String str1 = "Ravi Prakash";
			String str2 = "Ravi\nPrakash";

     // first character
			System.out.println(obj.CharAt(str1, 0));  // 'L'

     // seventh character
			System.out.println(obj.CharAt(str1, 6));  // 'J'


     // sixth character
			System.out.println(obj.CharAt(str2, 5));  // '\n'
			System.out.println(); 
		}
}