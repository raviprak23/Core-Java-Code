package constructor;

class parent {
	parent(){ // default constructor
		System.out.println("i am a constructor");
	}
	parent(int a, int b){
		System.out.println("i am a constructor value of" +a);
		System.out.println("i am a constructor value of" +b);
	}
	public  int x;
		public int getX() {
		return x;
	
	}
		public void setx(int x) {
			this.x = x;

		}
		
}

class child extends parent {
	
	//static int a;
	
	child(int a, int b){
		super(a,b);
		//super(b);
		System.out.println("i am a constructor of child a" );
	}
	public  int y;
	public int gety() {
	return y;

	}
	public void sety(int y) {
		this.y = y;
	}	
}	

public class constructorinheritance {
	
	public static void main(String[] args) {
		child c = new child(23,45);// constructor invoked
		
		//parent p = new parent();
	}
}



