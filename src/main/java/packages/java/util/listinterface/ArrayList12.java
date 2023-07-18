//Accessing and removing ArrayList elements using Iterator 
package packages.java.util.listinterface;

import java.util.*;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
}

class ArrayList12 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(100, "Rakesh", 20000.00));
		empList.add(new Employee(101, "Ravi", 16000.00));
		empList.add(new Employee(102, "Geetha", 17000.00));
		empList.add(new Employee(103, "Vaani", 15000.00));

		// Accessing Iterator from collection
		Iterator<Employee> empIterator = empList.iterator();

		// Accessing elements using Iterator and removing employees whose
		// salary<17000
		while (empIterator.hasNext()) {
			Employee emp = empIterator.next();

			if (emp.getSalary() < 17000) {
				empIterator.remove();
			} else {
				System.out.println("Employee id is " + emp.getId());
				System.out.println("name is " + emp.getName());
				System.out.println("Salary is " + emp.getSalary());
				System.out.println();
			}
		}
	}
}
