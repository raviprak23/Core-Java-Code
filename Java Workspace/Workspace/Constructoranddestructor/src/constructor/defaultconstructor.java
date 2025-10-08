package constructor;

//public class defaultconstructor {

//}

public class defaultconstructor {
    /*Class to demonstrate insertion of default constructor by the compiler
     if programmer doesn't create any constructor in a class.
     */
    void printOnScreen(){   
        System.out.println("No programmer created constructor in class.");
    }

//main 
public static void main(String[] args) {

  /*Instantiating new object with the default constructor
  which the compiler will insert.
  
  This will happen because programmer hasn't created any
  constructor in the class "Example1"
 */
	defaultconstructor obj1=new defaultconstructor();
    obj1.printOnScreen();
 }
}
