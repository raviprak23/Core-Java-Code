package constructor;

class Ravi {
	// protected String name = "Purva shinde";
	// protected int id = 345;
	private String name = "RaviPrakash";
	private int id = 235;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setid(int i) {
		this.id = 1;
	}

	public int getid() {
		return id;
	}

}

public class constructor {
	public static void main(String[] args) {
		Ravi r = new Ravi();
		System.out.println(r.getName());
		System.out.println(r.getid());
	}

}