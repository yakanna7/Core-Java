//Java program to implement copy constructor

package oops.constructors;

class Employee {

	private String name;
	private String gender;
	private int id;
	private float salary;

	Employee(String name, String gender, int id, float salary)// parameterised
																// constructor
	{
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.salary = salary;
	}

	Employee(Employee emp) // copy constructor
	{
		name = emp.name;
		gender = emp.gender;
		id = emp.id;
		salary = emp.salary;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public static void main(String args[]) {

		Employee emp1 = new Employee("Ravi", "Male", 111, 30000.0f);
		Employee emp2 = new Employee(emp1);

		System.out.println("Actual employee Details are");
		System.out.println("Name is " + emp1.getName());
		System.out.println("Gender is " + emp1.getGender());
		System.out.println("Id is " + emp1.getId());
		System.out.println("Salary is " + emp1.getSalary());

		System.out.println("\nCopied employee Details are");
		System.out.println("Name is " + emp2.getName());
		System.out.println("Gender is " + emp2.getGender());
		System.out.println("Id is " + emp2.getId());
		System.out.println("Salary is " + emp2.getSalary());
	}
}
