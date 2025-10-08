package practice;

public class methodoverloading {
	static void foo() {
		System.out.println("Good Morning bro!");
	}
	
	static void foo(int a) {
		System.out.println("Good Morning "+ a + "bro!");
	} 
	static void foo(int a, int b) {
		System.out.println("Good Morning "+ a + "bro!");
		System.out.println("Good Morning "+ b + "bro!");
	} 
	//static void foo(int a, int b int c) {
		//System.out.println("Good Morning "+ a + "bro!");
		//System.out.println("Good Morning "+ b + "bro!");
		
		
	//}
	static void change(int a) {
		a = 98;
	}
	static void change2(int [] arr) {
		arr[0] = 98;
	}
 
	static void tellJoke() {
		System.out.println("i am a boy");
	}


 public static void main(String[] args) {
	// tellJoke();
	// int [] marks = { 52,73,77,89,98,94};
//Case 1: changing the integer
	// int x = 45;
	 //change(x);
	 //System.out.println("the values of x after running change is: "+ x);
	 //Case 2: changing the array
		// int [] marks = {52,73,77,89,98,94};
		// change2(marks);
		// System.out.println("the values of x after running change is: "+marks[0]);
	 //method overloading
	 foo();
	
	foo(10);// actual arguments
	foo(20, 4000);
	
 }
 
 
 
}