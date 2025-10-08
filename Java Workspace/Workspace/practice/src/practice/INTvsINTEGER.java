package practice;

public class INTvsINTEGER {
	public static void main(String[] args) {
		int p = 55;
		String s = String.valueOf(p);
		String s1 = Integer.toString(p);// inbuilt function
		System.out.println("the value of p & s): "+(p+s1));
		
		//---------------------------------------
		int a = 5;
		int b = 6;
		int c = a + b;
		System.out.println("c = : " +c);
		
		Integer a1 = 5;
		Integer b1 = 6;
		Integer c1 = a1 + b1;
		System.out.println("c1 = : " +c1);
	}
}
