package oops.abstraction;

class FullTimeEmployee extends Employee 
{
	public double annualSalary;

	public FullTimeEmployee(int id, String firstName, String lastName,
			String gender, double annualSalary) {
		super(id, firstName, lastName, gender);
		this.annualSalary = annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getMonthlySalary() {
		return annualSalary / 12;
	}
}

