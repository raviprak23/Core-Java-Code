package garbage_collection;

//public class gabagecollectionbasic {

//}

public class gabagecollectionbasic {  
	 public void finalize(){System.out.println("object is garbage collected");}  
	 	public static void main(String args[]){  
	 		gabagecollectionbasic s1=new gabagecollectionbasic();  
	 		gabagecollectionbasic s2=new gabagecollectionbasic();  
	 		s1=null;  
	 		s2=null;  
	 		System.gc();  
	 	}  
}  