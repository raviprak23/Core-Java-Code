package Encapsulation;

public class Encapsulationmethodoverriding {

	static class Person {
		private String name;
		private int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	}

	// Method overriding example
	static class Employee extends Person {
		private int salary;

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public int getSalary() {
			return salary;
		}
	}

	public static void main(String[] args) {

		Person p = new Person();
		p.setName("Person");
		p.setAge(55);
		System.out.println(p.getAge());
		System.out.println(p.getName());

		Employee e = new Employee();
		e.setSalary(1200);
		e.setAge(50);
		System.out.println(e.getSalary());
		System.out.println(e.getAge());
	}

}