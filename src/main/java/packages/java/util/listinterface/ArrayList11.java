// Accessing ArrayList user defined objects with for each loop
package packages.java.util.listinterface;

import java.util.*;

class Student {
	private int id;
	private String name;
	private String gender;
	private String course;

	public Student(int id, String name, String gender, String course) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}

class ArrayList11 {
	public static void main(String args[]) {
		List<Student> stuentsList = new ArrayList<Student>();

		stuentsList.add(new Student(1, "Sujith", "Male", "B.Tech"));
		stuentsList.add(new Student(2, "Rahul", "Male", "B.Tech"));
		stuentsList.add(new Student(3, "Vinod", "Male", "MCA"));
		stuentsList.add(new Student(4, "Sujitha", "Female", "MCA"));

		int i = 1;
		for (Student s : stuentsList) {
			System.out.println("Student " + i + " details are");
			System.out.println("Id is " + s.getId());
			System.out.println("Name is " + s.getName());
			System.out.println("Gender is " + s.getGender());
			System.out.println("Course is " + s.getCourse());
			System.out.println();
			i++;
		}
	}
}

