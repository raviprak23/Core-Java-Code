package Inheritance;
//import inheritanceinaccessmodifier;
public class inheritanceinaccess {

	public static void main(String[] args) 
		 { 
			Som bb = new Som(); 
			// System.out.println(bb.a); // Compile time error because private members cannot be accessed in the subclass. 
		    System.out.println(bb.b); // Compile time error because default members of superclass can be accessed in the subclass within the same package only. 
		    System.out.println(bb.c); // Compile time error because protected members of superclass can be accessed in the subclass within the same package only. 
		    System.out.println(bb.d); // public members can be accessible anywhere. 
		  
		   // System.out.println(bb.e); // Compile time error because private members cannot be accessed in the subclass. 
		    System.out.println(bb.f); // Compile time error because default members of superclass can be accessed in the subclass within the same package only. 
		    System.out.println(bb.g); // Compile time error because protected members of superclass can be accessed in the subclass within the same package only. 
		    System.out.println(bb.h); // public members can be accessible anywhere. 
		  }
	}


