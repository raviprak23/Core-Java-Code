package Exception;

import java.util.ArrayList;
import java.util.List;

public class outofmemory {
	public static void main(String[] args) {
		List<Integer[]> list = new ArrayList<Integer[]>();
		try {
			while (true) {
				Integer[] array = new Integer[100000000];
				list.add(array);
			}
		} catch (OutOfMemoryError e) {
			System.out.println("Out of memory!");
		}
	}
}