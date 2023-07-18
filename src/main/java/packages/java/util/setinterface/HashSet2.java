//Java HashSet with user defined objects
package packages.java.util.setinterface;

import java.util.HashSet;
import java.util.Iterator;

class Student {
	private int id;
	private String name;
	private String branch;

	public Student(int id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

class HashSet2 {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();

		// Adding elements to HashSet

		set.add(new Student(1122, "Avinash", "ECE"));
		set.add(new Student(2233, "Ravi", "Civil"));
		set.add(new Student(3344, "Bharat", "EEE"));
		set.add(new Student(4455, "Vikram", "CSE"));
		set.add(new Student(5566, "Suresh", "IT"));
		set.add(new Student(1122, "Kiran", "IT")); // duplicate element
		set.add(new Student(3344, "Raj", "IT"));// duplicate element

		// Iterating through HashSet
		Iterator<Student> it = set.iterator();
		System.out.println("All students details are");
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is: " + s.getId());
			System.out.println("Name is: " + s.getName());
			System.out.println("Branch is: " + s.getBranch());
			System.out.println();
		}
	}
}
