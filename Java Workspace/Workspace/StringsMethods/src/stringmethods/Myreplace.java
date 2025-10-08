
package stringmethods;

	class ReplaceClass {
		public String Replace(String s1, char src, char dest) {
			char str[] = s1.toCharArray();
			int i = 0;
			while (i < str.length) {
				if (str[i] == src) {
					str[i] = dest;
				}
				i++;
			}
			return String.valueOf(str);
		}
}

	public class Myreplace {
		public static void main(String[] args) {
			ReplaceClass obj = new ReplaceClass();
			String str1 = "Ravi Prakash";

			// all occurrences of 'a' is replaced with 'z'
			System.out.println(obj.Replace(str1, 'a', 'z'));  // zbc cbz

			// all occurences of 'L' is replaced with 'J'
			System.out.println(obj.Replace("Rava",'L', 'J'));  // Java

			// character not in the string
			System.out.println(obj.Replace("Hello", '4', 'J'));  // Hello

		}
}