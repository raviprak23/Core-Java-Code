package Final;

//public class finalbasic {

//}

public class finalbasic {  
		//declaring final variable  
    		final int age = 18;  
    		void display() {
    			System.out.println(age);
      
    // reassigning value to age variable   
    // gives compile time error  
    	int age1 = 55;
    	// int age1 = 1;
       System.out.println(age1);	 
    }  
      
    	public static void main(String[] args) {  
      
    		finalbasic obj = new finalbasic();  
    		// gives compile time error  
    		obj.display();  
    	}  
}  
