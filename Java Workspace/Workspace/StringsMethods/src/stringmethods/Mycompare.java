//package stringmethods;

//public class Mycompare {

//}
package stringmethods;

	class CompareClass {
		public int Compare (String s1, String s2) {
			char str1[] = s1.toCharArray();
			char str2[] = s2.toCharArray();
			int i;
			if (str1.length == str2.length) {
				for (i = 0; i < str1.length; i++) {
					if (str1[i]  != str2[i]) {
						return 1;
					}
				}
			} else {
				return 1;
			}
			return 0;
		}
}

	public class Mycompare {
		public static void main(String[] args) {
			String str1 = "Ravi Prakash";
			String str2 = "Ravi Prakash";
			String str3 = "Learn Java";
			//System.out.println();
			CompareClass obj = new CompareClass();
			// comparing str1 with str2
			if ((obj.Compare(str1, str2)) == 0) {
				System.out.println("String str1 and str2 are equal");
			} else {
				System.out.println("Strings str1 and str2 are not equal");
			}

			// comparing str1 with str3
			if (obj.Compare(str1, str3) == 0) {
				System.out.println("Strings str1 and str3 are equal");
			} else {
				System.out.println("Strings str1 and str3 are not equal");
			}
   
			// comparing str3 with str1
			if (obj.Compare(str3, str2) == 0) {
				System.out.println("Strings str2 and str3 are equal");
			} else {
				System.out.println("Strings str2 and str3 are not equal");
			}
		}
}
