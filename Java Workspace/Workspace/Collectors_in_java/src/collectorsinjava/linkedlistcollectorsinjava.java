package collectorsinjava;

//public class linkedlistcollectorsinjava {

//}
	import java.util.*;  
	public class linkedlistcollectorsinjava{  
		public static void main(String args[]){  
			LinkedList<String> al=new LinkedList<String>();  	
			al.add("Ravi");  
			al.add("prakash");  
			al.add("Ravi");  
			al.add("krishan");  
			Iterator<String> itr=al.iterator();  
			while(itr.hasNext()){  
				System.out.println(itr.next());  
			}  
		}  
}