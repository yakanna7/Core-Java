//Java program to call parent class constructor in child class constructor
package oops.inheritance.superkeyword;

class Person {

	private String name;
	private String gender;
	private String add;

	Person(String name, String gender, String add) {
		this.name = name;
		this.gender = gender;
		this.add = add;
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

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}
}

class Student extends Person {
	private int htno;
	private String course;

	Student(String name, String gender, String add, int htno, String course) {
		super(name, gender, add); // calling parent class constructor

		this.htno = htno;
		this.course = course;
	}

	public int getHtno() {
		return htno;
	}

	public void setHtno(int htno) {
		this.htno = htno;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public static void main(String args[]) {
		Student s = new Student("Shiva", "Male", "Kphb", 1234, "B.Tech");

		System.out.println("Name is " + s.getName());
		System.out.println("Gender is " + s.getGender());
		System.out.println("Address is " + s.getAdd());
		System.out.println("Rno is " + s.getHtno());
		System.out.println("Course is " + s.getCourse());
	}
}
