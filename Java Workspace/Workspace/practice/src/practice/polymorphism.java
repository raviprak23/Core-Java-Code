package practice;

class Bird {
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
}

class Robin extends Bird {
	public void sing(String song) {
		System.out.println("hehehhehehe");
	}
}
	 

class Pelican extends Bird {
	public void sing() {
		System.out.println("kwahkwahkwah");
	}
}



public class polymorphism {
	public static void main(String[] args) {
		Robin b = new Robin(); 
		//Pelican b = new Pelican(); 
		b.sing();
	}
}