//Java program to implement static variable
package oops.statickeyword;

class Employee {
	private int id;
	private String name;
	private String gender;
	private float salary;

	public static String organization = "Fratello Innotech";

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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public static void main(String args[]) {
		Employee emp = new Employee();

		emp.setId(2015);
		emp.setName("Swapna");
		emp.setGender("Female");
		emp.setSalary(50000);
		System.out.println("Employee id is " + emp.getId());
		System.out.println("Employee Name is " + emp.getName());
		System.out.println("Gender is " + emp.getGender());
		System.out.println("Salary  is " + emp.getSalary());
		System.out.println("Organigation is " + Employee.organization);
	}
}
