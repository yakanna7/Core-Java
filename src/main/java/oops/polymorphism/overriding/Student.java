//Java example to override toString() method
package oops.polymorphism.overriding;

class Student
{
	private int id;
	private String name;
	private String course;

	public Student(int id, String name, String course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public String toString() // overriding Object class method
	{
		return "ID:" + id + " Name:" + name + " Course:" + course;
	}

	public static void main(String args[]) {
		Student s = new Student(1177, "Swapna", "Java");
		System.out.println(s);
	}
}
