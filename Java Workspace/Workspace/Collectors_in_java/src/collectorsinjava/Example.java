package collectorsinjava;


class BankAccount<T>{
	T t1;

	BankAccount(T t1) {
		this.t1 = t1;
	}
	public void display() {
		System.out.println(t1);
	}
	/*@SuppressWarnings("hiding")
	public <T> void depositeMoney(T[] money) {
		for(T i:money) {
			System.out.println(i);
		}
	 }*/
}

public class Example {
 	static public void main(String[] args) {
		
	BankAccount<String> b1 = new BankAccount<>("Ravi");
	BankAccount<Integer> b2 = new BankAccount<>(4);
	b1.display();
	b2.display();
	//System.out.println(b2);
}
}
