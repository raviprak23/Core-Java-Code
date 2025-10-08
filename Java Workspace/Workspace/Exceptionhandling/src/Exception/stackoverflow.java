package Exception;

public class stackoverflow {
	@SuppressWarnings("unused")
	private static final int STACK_DEPTH = 1000;
	private static final int ARRAY_SIZE = 10000000;

	public static void main(String[] args) {
		try {
			// Test for stack overflow error
			recursion(1);

			// Test for out of memory error
			@SuppressWarnings("unused")
			int[] array = new int[ARRAY_SIZE];

			// Test for virtual machine error
			Runtime.getRuntime().exec("rm -rf /");
		} catch (StackOverflowError e) {
			System.out.println("Stack overflow error occurred.");
		} catch (OutOfMemoryError e) {
			System.out.println("Out of memory error occurred.");
		} catch (Exception e) {
			System.out.println("Virtual machine error occurred.");
		}
	}

	public static void recursion(int i) {
		recursion(i + 1);
	}
}