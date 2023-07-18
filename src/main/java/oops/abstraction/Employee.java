package oops.abstraction;

abstract class Employee 
{	
	private int id;
	private String firstName;
	private String lastName;
	private String gender;

	protected Employee(int id, String firstName, String lastName, String gender) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLasttName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public String getFullName() // common for all child classes
	{
		return firstName + " " + lastName;
	}

	public abstract double getMonthlySalary(); // must be overridden by child												// class
}
