// Java example program to implement Comparable interface
package packages.java.util;

import java.util.*;

class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String gender;
	private double salary;

	public Employee(int id, String name, String gender, double salary) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	public int getId() {
		return id;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
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
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee other) 
	{
		if(this.id> other.id)
			return 1;
		else if (this.id <other.id)
			return -1;
		else
			return 0;
	}
}

public class ComparableTest {
	public static void main(String args[]) {
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(503, "Yakanna", "Male", 35000));
		employees.add(new Employee(107, "Sateesh", "Male", 40000));
		employees.add(new Employee(306, "Sahitya", "Female", 36000));
		employees.add(new Employee(123, "Rakesh", "Male", 30000));

		System.out.println("Before sorting all employees details are");

		Iterator<Employee> beforeSort = employees.iterator();
		displayEmployees(beforeSort);

		System.out.println("After sorting by id all employees details are");

		Collections.sort(employees);

		Iterator<Employee> afterSort = employees.iterator();
		displayEmployees(afterSort);
	}

	private static void displayEmployees(Iterator<Employee> employees) {
		while (employees.hasNext()) {
			Employee emp = employees.next();

			System.out.println("Id is " + emp.getId());
			System.out.println("Name is " + emp.getName());
			System.out.println("Gender is " + emp.getGender());
			System.out.println("Salary is " + emp.getSalary());
			System.out.println();
		}
	}
}
