package oops.settergetter;

class Employee {

	private int id;
	private String name;
	private String gender;
	private String designation;
	private float salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id<1)
			System.out.println("Id must be a positive value");
		else
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

	public void setSal(float salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public static void main(String args[]) 
	{
		Employee emp = new Employee();
		
		emp.setId(100);
		emp.setName("Swapna");
		emp.setGender("Female");
		emp.setDesignation("Software Engineer");
		emp.setSal(30000);
		
		System.out.println("Employee Id is " + emp.getId());
		System.out.println("Employee name is " + emp.getName());
		System.out.println("Gender is "+emp.getGender());
		System.out.println("Salary is " + emp.getSalary());
		System.out.println("Designation is " + emp.getDesignation());
	}	
}

