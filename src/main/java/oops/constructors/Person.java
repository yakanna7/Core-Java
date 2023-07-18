//Java program to implement parameterised constructor

package oops.constructors;

class Person {

	private String name;
	private String gender;
	private int age;
	private String address;

	Person(String name, String gender, int age, String address) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String args[]) {

		Person p1 = new Person("Yakanna", "Male", 29, "KPHB");
		// Person p2 = new Person(); // not possible to create object
		System.out.println("Person name is " + p1.getName());
		System.out.println("Gender is " + p1.getGender());
		System.out.println("Age is " + p1.getAge());
		System.out.println("Address is " + p1.getAddress());
	}
}
