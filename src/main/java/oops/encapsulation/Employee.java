package oops.encapsulation;

class Employee {

	public int id;
	public String name;

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

	// Add new employee to DB is the main functionality
	// This is ABSTRACTION
	public void AddEmployee(Employee obj) {

		createDBConnection();
		checkIfEmployeeExists();
	}

	// ENCAPLUSATION using private keyword
	private boolean checkIfEmployeeExists() {
		// Here we can validate if the employee already exists
		return true;
	}

	// ENCAPLUSATION using private keyword
	private void createDBConnection() {
		// Create DB connection code
	}
}

class EmployeeDataApp {

	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.setId(1992);
		emp.setName("Swapna");
		// We have exposed only what part of the functionality
		emp.AddEmployee(emp);
	}
}
