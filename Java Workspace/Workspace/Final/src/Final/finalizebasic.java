package Final;

//public class finalizebasic {

//}
public class finalizebasic {    
    public static void main(String[] args)     
   {     
       finalizebasic obj = new finalizebasic();        
       // printing the hashcode   
       System.out.println("Hashcode is: " + obj.hashCode());           
       obj = null;    
       // calling the garbage collector using gc()   
       System.gc();     
       System.out.println("End of the garbage collection");     
   }     
  // defining the finalize method   
    	//protected void finalize()     
   {     
    		//System.out.println("Called the finalize() method");     
   		}     
}    