package generics;

import java.util.ArrayList;

public class basicgenerics {
	public static void main(String[] args) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList<Integer> arraylist = new ArrayList();
		//ArrayList<int> arraylist = new ArrayList();// this will produce an error
				//arraylist.add("str1");(because we are taking a integer)
				arraylist.add(54);
				arraylist.add(643);
				
	
				int a = (int) arraylist.get(1);
				System.out.println(a);
	}	
	
}




