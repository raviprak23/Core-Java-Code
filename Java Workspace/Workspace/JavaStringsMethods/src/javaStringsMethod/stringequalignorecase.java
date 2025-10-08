package javaStringsMethod;

class stringequalignorecase {
    public static void main(String[] args) {
        String str1 = "Learn Java";
        String str2 = "learn java";
        String str3 = "Learn Kolin";
        Boolean result;

        // comparing str1 with str2
        result = str1.equalsIgnoreCase(str2);
        System.out.println(result); // true

        // comparing str1 with str3
        result = str1.equalsIgnoreCase(str3);
        System.out.println(result); // false

        // comparing str3 with str1
        result = str3.equalsIgnoreCase(str1);
        System.out.println(result); // false
    }
}