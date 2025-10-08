package stringmethods;

//public class Mylower {

//}
//package Strings;

	class LowerClass {
		public String Lower(String data) {
			char str[] = data.toCharArray();
			int i;
			for (i = 0; i < str.length; i++) {
				if (str[i] >= 'A' && str[i] <= 'Z') {
					str[i] = (char)((int) str[i] + 32);
				}
			}
			data = String.valueOf(str);
			return data;
		}
}

	public class Mylower {
		public static void main(String[] args) {
			LowerClass obj = new LowerClass();
			String str1 = "RAVI PRAKASH";
     
			// convert to lower case letters
			System.out.println(obj.Lower(str1));
		}
}