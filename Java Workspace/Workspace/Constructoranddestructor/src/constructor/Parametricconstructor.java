package constructor;


public class Parametricconstructor {
    // Default constructor created by programmer
    
	Parametricconstructor(){
        System.out.println("Default constructor");
    }
    
    /* The compiler would not create default constructor 
     * in this case as user has created his own 
     * parameterized constructors
     */

    /* Parameterized constructor with
     * one String argument
     */
    private String n1; 
    Parametricconstructor(String name){
        this.n1=name;
        System.out.println("Parameterized constructor with one String argument.\n"+"Name: "+n1);
    }

    /* Parameterized constructor with
     * one string and one integer argument
     */
    private int n2;
    Parametricconstructor(String name, int age){
        this.n1=name;
        this.n2=age;
        System.out.println("Parameterized constructor with one string and one integer argument.\n"+"Name:"+n1+" Age:"+n2);
    }

public static void main(String[] args) {

        //Invoking default constructor
	Parametricconstructor s1 = new Parametricconstructor();
        
        //Parameterized constructor with one String parameter.
	Parametricconstructor s2 = new Parametricconstructor("Krishna Das");
        
        //Parameterized constructor with one String and one integer  parameter.
	Parametricconstructor s3 = new Parametricconstructor("Pawan Singhania", 21);
    }
}
